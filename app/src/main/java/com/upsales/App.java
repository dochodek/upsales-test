package com.upsales;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.upsales.dagger.ApiComponent;
import com.upsales.dagger.ApiModule;
import com.upsales.dagger.AppModule;
import com.upsales.dagger.DaggerApiComponent;

import timber.log.Timber;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Timber
        if (BuildConfig.DEBUG)
            Timber.plant(new Timber.DebugTree());
        // Dagger 2
        apiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule(ApiModule.UPSALES_API_BASE_URL))
                .build();
        // Calligraphy
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    public ApiComponent getApiComponent() {
        return apiComponent;
    }
    private ApiComponent apiComponent;

}
