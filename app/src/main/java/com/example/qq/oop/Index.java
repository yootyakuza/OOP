package com.example.qq.oop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Index extends AppCompatActivity {

    ImageButton butimgFactory,butimgBuilder,butimgSingleton,butFacade;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        butimgFactory = findViewById(R.id.butimgFactory);
        butimgBuilder = findViewById(R.id.butimgBuilder);
        butimgSingleton = findViewById(R.id.butimgSingleton);
        butFacade = findViewById(R.id.butFacade);
        context = this;

        butimgFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,FactoryMethodActivity.class);
                startActivity(intent);
            }
        });

        butimgBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,BuilderActivity.class);
                startActivity(intent);
            }
        });

        butimgSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SingletonActivity.class);
                startActivity(intent);
            }
        });
        butFacade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,FacadeActivity.class);
                startActivity(intent);
            }
        });
    }
}
