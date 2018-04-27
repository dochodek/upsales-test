package com.upsales.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.upsales.R;
import com.upsales.ui.base.CoreActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FilterActivity extends CoreActivity {

    @BindView(R.id.Toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getApp().getApiComponent().inject(this);
    }
}
