package com.example.qq.oop.Factory_method;

/**
 * Created by Sarayut on 5/7/2561.
 */
public class ExcelApp extends Aplication {

    @Override
    public File createFile() {
        return new ExcelFile();
    }
}
