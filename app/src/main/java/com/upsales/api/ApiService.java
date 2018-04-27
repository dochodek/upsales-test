package com.upsales.api;

import com.upsales.dagger.ApiModule;
import com.upsales.model.AccountsResponse;
import com.upsales.model.UsersResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiService {

    @GET(ApiModule.UPSALES_USERS_URL)
    Single<UsersResponse> getUsers(@Query("token") String token);

    @GET(ApiModule.UPSALES_ACCOUNTS_URL)
    Single<AccountsResponse> getAccounts(@Query("token") String token,@Query("sort") String sort,
                                         @Query("limit") String limit, @Query("offset") String offset);

    @GET(ApiModule.UPSALES_ACCOUNTS_URL+"{id}")
    Single<AccountsResponse> getAccount(@Path(value = "id") String id, @Query("token") String token);
}
