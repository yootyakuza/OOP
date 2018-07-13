package com.example.qq.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.qq.oop.Singleton.Config;
import com.example.qq.oop.Singleton.Config2;

public class SingletonActivity extends AppCompatActivity {

    TextView tvSingleton,tvSingleton2;
    Button butSingleton,butSingleton2;
    Config config;
    Config2 config2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        tvSingleton = findViewById(R.id.tvSingleton);
        tvSingleton2 = findViewById(R.id.tvSingleton2);
        butSingleton = findViewById(R.id.butSingleton);
        butSingleton2 = findViewById(R.id.butSingleton2);
        config = new Config();
        config2 = Config2.getInstance();
        butSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSingleton.setText(config.getData());
            }
        });

        butSingleton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvSingleton2.setText(config2.getData());
            }
        });
    }
}
