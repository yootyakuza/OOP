package com.example.qq.oop.Singleton;

/**
 * Created by Sarayut on 6/7/2561.
 */
public class Config2 {
    private static String data = "sarayut2";
    private static Config2 instance;

    private Config2() {
    }

    public static Config2 getInstance() {
        if(instance == null)
            instance = new Config2();
        return instance;
    }

    public static String getData() {
        return data;
    }
}
