package com.upsales.dagger;


import com.upsales.ui.CompanyActivity;
import com.upsales.ui.FilterActivity;
import com.upsales.ui.FilterSelectionActivity;
import com.upsales.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={ApiModule.class, AppModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
    void inject(FilterSelectionActivity activity);
    void inject(FilterActivity activity);
    void inject(CompanyActivity activity);
}
