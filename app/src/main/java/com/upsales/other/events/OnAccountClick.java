package com.upsales.other.events;

import com.upsales.model.DataAccounts;

/**
 * Created by Dominik on 2018-04-27.
 */

public class OnAccountClick {

    final private DataAccounts account;

    public OnAccountClick(DataAccounts account) {
        this.account = account;
    }

    public DataAccounts getAccount() {
        return account;
    }
}
