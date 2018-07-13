package com.example.qq.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.qq.oop.Facade.hr.Employee;
import com.example.qq.oop.Facade.noc.Account;
import com.example.qq.oop.Facade.rd.Researcher;

public class FacadeActivity extends AppCompatActivity {

    TextView tf,tf2,tf3,tf4;
    Button butFE,butFA,butFR;
    Employee employee;
    Account account;
    Researcher researcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        tf = findViewById(R.id.tF);
        tf2 = findViewById(R.id.tF2);
        tf3 = findViewById(R.id.tF3);
        tf4 = findViewById(R.id.tF4);
        butFE = findViewById(R.id.butFacade1);
        butFA = findViewById(R.id.butFacade2);
        butFR = findViewById(R.id.butFacade3);

        butFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee = new Employee("sarayut","R&D","063-436-6972");
                employee.save(tf,tf2,tf3,tf4);
            }
        });

        butFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account = new Account("sarayut","yoot","1234");
                account.save(tf,tf2,tf3,tf4);
            }
        });

        butFR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                researcher = new Researcher("sarayut","Android Developer");
                researcher.save(tf,tf2,tf3);
                tf4.setText("");
            }
        });
    }
}
