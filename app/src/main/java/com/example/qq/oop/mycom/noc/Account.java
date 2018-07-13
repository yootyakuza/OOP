package com.example.qq.oop.mycom.noc;

import android.widget.TextView;

/**
 * Created by Sarayut on 13/7/2561.
 */
public class Account {
    private String name,accountName,password;

    public Account(String name, String accountName, String password) {
        this.name = name;
        this.accountName = accountName;
        this.password = password;
    }

    public void save(TextView t,TextView t2,TextView t3, TextView t4){
        t.setText("name             = " + name);
        t2.setText("account name    = " + accountName);
        t3.setText("password        = " + password);
        t4.setText("save account to NOC database.");
    }
}
