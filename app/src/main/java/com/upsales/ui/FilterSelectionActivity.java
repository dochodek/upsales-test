package com.upsales.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.upsales.R;
import com.upsales.ui.base.CoreActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FilterSelectionActivity extends CoreActivity {

    @BindView(R.id.Toolbar) Toolbar toolbar;
    @OnClick(R.id.cancel_layout) void onCancel(){
        onBackPressed();
    }
    @OnClick(R.id.account_managers_layout) void onAccountManagersFilter(){
        // Not implemented yet
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_selection);
        ButterKnife.bind(this);
        getApp().getApiComponent().inject(this);
        setToolbar();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_down);
    }

    private void setToolbar() {
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setHomeButtonEnabled(false);
            ab.setDisplayHomeAsUpEnabled(false);
            ab.setDisplayShowTitleEnabled(false);
            TextView tvTitle = toolbar.findViewById(R.id.toolbar_title);
            tvTitle.setText(getString(R.string.filters));
        }
    }

}
