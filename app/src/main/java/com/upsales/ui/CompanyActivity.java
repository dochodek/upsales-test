package com.upsales.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.upsales.R;
import com.upsales.model.DataAccounts;
import com.upsales.other.Constants;
import com.upsales.other.adapters.AddressesAdapter;
import com.upsales.ui.base.CoreActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class CompanyActivity extends CoreActivity {

    @BindView(R.id.Toolbar) Toolbar toolbar;

    @BindView(R.id.name) TextView tvName;
    @BindView(R.id.location) TextView tvLocation;
    @BindView(R.id.recycler) RecyclerView recycler;

    private DataAccounts account;
    private AddressesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        ButterKnife.bind(this);
        getApp().getApiComponent().inject(this);
        getDataFromIntent(getIntent());
        setToolbar();
        initRecycler();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right,
                R.anim.slide_out_right);
    }

    private void initRecycler() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
             account = (DataAccounts) extras.getSerializable(Constants.INTENT_DATA_ACCOUNTS);
            if (account != null){
                Timber.v("Id: "+account.getId());
                setUI();
            }
        }
    }

    private void setUI() {
        tvName.setText(account.getName());
        tvLocation.setText(account.getAddresses().get(0).getCountry());
        adapter = new AddressesAdapter(account.getAddresses());
        recycler.setAdapter(adapter);
    }

    private void setToolbar() {
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setHomeButtonEnabled(true);
            ab.setDisplayHomeAsUpEnabled(true);
            ab.setHomeAsUpIndicator(R.drawable.ic_arrow_left_white_24dp);
            ab.setDisplayShowTitleEnabled(false);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
