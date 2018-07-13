package com.example.qq.oop.Factory_method;

import android.widget.TextView;

/**
 * Created by Sarayut on 5/7/2561.
 */
public class WordFile extends File{
    @Override
    public void open(TextView t1) {
        t1.setText("Open Word File");
        //System.out.println("Open Word File");
    }

    @Override
    public void save(TextView t2) {
        t2.setText("Save Word File");
        //System.out.println("Save Word File");
    }

    @Override
    public void edit(TextView t3) {
        t3.setText("Edit Word File");
        //System.out.println("Edit Word File");
    }
}
