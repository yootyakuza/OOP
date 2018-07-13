package com.example.qq.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.qq.oop.Factory_method.Aplication;
import com.example.qq.oop.Factory_method.ExcelApp;
import com.example.qq.oop.Factory_method.File;
import com.example.qq.oop.Factory_method.WordApp;

public class FactoryMethodActivity extends AppCompatActivity {

    TextView t1,t2,t3,tE1,tE2,tE3;
    Aplication app1,app2;
    File file,file2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);
        tE1 = findViewById(R.id.textE1);
        tE2 = findViewById(R.id.textE2);
        tE3 = findViewById(R.id.textE3);

        app1 = new WordApp();
        app2 = new ExcelApp();
        file = app1.createFile();
        file2 = app2.createFile();

        file.open(t1);
        file.edit(t2);
        file.save(t3);

        file2.open(tE1);
        file2.edit(tE2);
        file2.save(tE3);
    }
}
