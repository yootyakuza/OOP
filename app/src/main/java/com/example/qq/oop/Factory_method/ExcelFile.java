package com.example.qq.oop.Factory_method;

import android.widget.TextView;

/**
 * Created by Sarayut on 5/7/2561.
 */
public class ExcelFile extends File {
    @Override
    public void open(TextView t1) {
        t1.setText("Open Excel File");
    }

    @Override
    public void save(TextView t2) {
        t2.setText("Save Excel File");
    }

    @Override
    public void edit(TextView t3) {
        t3.setText("Edit Excel File");
    }
}
