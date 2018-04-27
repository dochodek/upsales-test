package com.upsales.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;

import com.upsales.R;
import com.upsales.api.ApiService;
import com.upsales.dagger.ApiModule;
import com.upsales.model.AccountsResponse;
import com.upsales.other.Constants;
import com.upsales.other.ListState;
import com.upsales.other.ListStateManager;
import com.upsales.other.Toasts;
import com.upsales.other.Utility;
import com.upsales.other.adapters.AccountsAdapter;
import com.upsales.other.events.OnAccountClick;
import com.upsales.other.events.OnLoadMoreClick;
import com.upsales.ui.base.CoreActivity;

import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import timber.log.Timber;

public class MainActivity extends CoreActivity {

    private final static int LIMIT = 10;
    private final static String NAME = "name";

    @Inject Retrofit retrofit;

    @BindView(R.id.Toolbar) Toolbar toolbar;
    @BindView(R.id.empty_ok) ViewStub emptyStub;
    @BindView(R.id.empty_error) ViewStub emptyErrorStub;
    @BindView(R.id.empty_network) ViewStub emptyNetworkStub;
    @BindView(R.id.progress) ViewStub progressStub;
    @BindView(R.id.recycler) RecyclerView recycler;
    @BindString(R.string.no_success) String noSuccess;

    private ListStateManager stateManager;
    private LinearLayoutManager layoutManager;
    private AccountsAdapter adapter;

    private int offset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getApp().getApiComponent().inject(this);
        setToolbar();
        initStateManager();
        initRecycler();
        getAccounts(offset);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_filter:
                Intent intent = new Intent(MainActivity.this, FilterSelectionActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_up, R.anim.stay);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Subscribe
    public void onLoadMore(OnLoadMoreClick event){
        Timber.v("LoadMore offset: "+offset);
        getAccounts(offset);
    }
    @Subscribe
    public void onAccount(OnAccountClick event){
        Timber.v("onAccount: "+event.getAccount().getName());
        Intent intent = new Intent(MainActivity.this, CompanyActivity.class);
        intent.putExtra(Constants.INTENT_DATA_ACCOUNTS,event.getAccount());
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,
                R.anim.slide_out_left);
    }

    private void setToolbar() {
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setHomeButtonEnabled(true);
            ab.setDisplayHomeAsUpEnabled(true);
            ab.setDisplayShowTitleEnabled(false);
            Drawable drawable = ResourcesCompat.getDrawable(getResources(),
                    R.drawable.ic_menu_white_24dp, null);
            if (drawable != null) {
                drawable = DrawableCompat.wrap(drawable);
                DrawableCompat.setTint(drawable, getResources().getColor(R.color.white_material));
                getSupportActionBar().setHomeAsUpIndicator(drawable);
            }
        }
    }
    private void initStateManager() {
        stateManager = new ListStateManager(recycler, progressStub,
                emptyNetworkStub, emptyStub, emptyErrorStub);
    }
    private void initRecycler() {
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getAccounts(final int offset) {
        if (!Utility.isNetworkAvailable(this)) {
            stateManager.setState(ListState.NetworkOff);
            return;
        }

        // Show loading progress only the first load
        if (offset == 0)
            stateManager.setState(ListState.Loading);

        // <-- API Call via Retrofit 2 & RxJava
        Single<AccountsResponse> single =
                retrofit.create(ApiService.class).getAccounts(ApiModule.UPSALES_TOKEN,
                        NAME, String.valueOf(LIMIT), String.valueOf(offset));
        single.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<AccountsResponse>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {}
                    @Override
                    public void onSuccess(@NonNull AccountsResponse response) {
                        Timber.v("getAccounts onNext ");
                        if (response != null) {
                            Timber.v("Response: " + response);
                            displayResults(response);
                        } else {
                            Toasts.showShortToast(MainActivity.this, noSuccess);
                            stateManager.setState(ListState.Error);
                        }
                    }
                    @Override
                    public void onError(@NonNull Throwable e) {
                        Timber.e("getAccounts onError " + e.toString());
                        Toasts.showShortToast(MainActivity.this, noSuccess + " "
                                + e.getMessage());
                        stateManager.setState(ListState.Error);
                    }
                });
    }

    private void displayResults(AccountsResponse response) {
        if (adapter != null) {
            // Stop showing Load More button when there is no data more to load
            if (response.getMetadata().getTotal()- LIMIT <= offset)
                adapter.setShowLoadMore(false);
            adapter.updateAll(response.getData());
        } else {
            adapter = new AccountsAdapter(response.getData());
        }
        if (recycler.getAdapter() == null)
            recycler.setAdapter(adapter);
        stateManager.setState(!adapter.getAll().isEmpty() ?
                ListState.Visible : ListState.Empty);

        // Update offset
        offset = offset + LIMIT;
    }
}
