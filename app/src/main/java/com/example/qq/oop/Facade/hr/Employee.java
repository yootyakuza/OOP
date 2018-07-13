package com.example.qq.oop.Facade.hr;

import android.widget.TextView;

/**
 * Created by Sarayut on 13/7/2561.
 */
public class Employee {
    private String name,department,tel;

    public Employee(String name, String department, String tel) {
        this.name = name;
        this.department = department;
        this.tel = tel;
    }

    public void save(TextView t,TextView t2,TextView t3, TextView t4){
        t.setText("name         = " + name);
        t2.setText("department  = " + department);
        t3.setText("tel         = " + tel);
        t4.setText("save employee to HR database.");
    }
}
