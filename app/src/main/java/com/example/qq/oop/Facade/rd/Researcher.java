package com.example.qq.oop.Facade.rd;

import android.widget.TextView;

/**
 * Created by Sarayut on 13/7/2561.
 */
public class Researcher {
    private String name, interestingField;

    public Researcher(String name, String interestingField) {
        this.name = name;
        this.interestingField = interestingField;
    }

    public void save(TextView t, TextView t2, TextView t3){
        t.setText("name                 = " + name);
        t2.setText("interesting field   = " + interestingField);
        t3.setText("save researcher to R&D database.");
    }
}
