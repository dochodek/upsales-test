package com.upsales.dagger;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.upsales.BuildConfig;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

@Module
public class ApiModule {

    public static final String UPSALES_API_BASE_URL = "https://integration.upsales.com/api/v2/";
    private static final String UPSALES_ACCOUNTS = "accounts";
    private static final String UPSALES_USERS = "users";
    public static final String UPSALES_ACCOUNTS_URL = UPSALES_API_BASE_URL + UPSALES_ACCOUNTS;
    public static final String UPSALES_USERS_URL = UPSALES_API_BASE_URL + UPSALES_USERS;
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final String UPSALES_TOKEN = "fab2dd8eb69dcdc3d108c7e7bfa6c4932fe69b06ba4cfe4c8cebe45d08a5b0a2";

    private String baseUrl;

    public ApiModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder().
                setDateFormat(DATE_FORMAT);
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkhttpClient() {
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .connectTimeout(10000, TimeUnit.SECONDS)
                .readTimeout(30000, TimeUnit.SECONDS);
        if (BuildConfig.DEBUG) {
            client.addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    Timber.v(message);
                }
            }).setLevel(HttpLoggingInterceptor.Level.BODY));
        }
        return client.build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .build();
    }
}
