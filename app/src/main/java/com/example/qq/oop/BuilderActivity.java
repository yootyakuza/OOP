package com.example.qq.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.qq.oop.Builder.LowerCaseBuilder;
import com.example.qq.oop.Builder.TextExportDirector;
import com.example.qq.oop.Builder.UpperCaseBuilder;

import java.io.IOException;

public class BuilderActivity extends AppCompatActivity {

    Button butBuilderUpper, butBuilderLower;
    EditText et1;
    TextView tv1;
    TextExportDirector director1, director2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        butBuilderUpper = findViewById(R.id.butBuilderUpper);
        butBuilderLower = findViewById(R.id.butBuilderLower);
        et1 = findViewById(R.id.editText1);
        tv1 = findViewById(R.id.tvBuilder1);
        director1 = new TextExportDirector();
        director1.registerBuilder(new UpperCaseBuilder());
        director2 = new TextExportDirector();
        director2.registerBuilder(new LowerCaseBuilder());

        butBuilderUpper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str = et1.getText().toString();
                try {
                    director1.exportTextToUpper(Str, tv1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        butBuilderLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str = et1.getText().toString();
                try {
                    director2.exportTextToLower(Str, tv1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
