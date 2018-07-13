package com.example.qq.oop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.qq.oop.Facade.MyComFacade;
import com.example.qq.oop.Facade.hr.Employee;
import com.example.qq.oop.Facade.noc.Account;
import com.example.qq.oop.Facade.rd.Researcher;

public class FacadeActivity extends AppCompatActivity {

    TextView tf,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
    Button butFE,butFA,butFR,butFAd;
    Employee employee;
    Account account;
    Researcher researcher;
    MyComFacade m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        tf = findViewById(R.id.tF);
        tf2 = findViewById(R.id.tF2);
        tf3 = findViewById(R.id.tF3);
        tf4 = findViewById(R.id.tF4);
        tf5 = findViewById(R.id.tF5);
        tf6 = findViewById(R.id.tF6);
        tf7 = findViewById(R.id.tF7);
        tf8 = findViewById(R.id.tF8);
        tf9 = findViewById(R.id.tF9);
        tf10 = findViewById(R.id.tF10);
        tf11 = findViewById(R.id.tF11);
        butFE = findViewById(R.id.butFacade1);
        butFA = findViewById(R.id.butFacade2);
        butFR = findViewById(R.id.butFacade3);
        butFAd = findViewById(R.id.butFacade4);
        m = new MyComFacade();

        butFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee = new Employee("sarayut","R&D","063-436-6972");
                employee.save(tf,tf2,tf3,tf4);
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
            }
        });

        butFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account = new Account("sarayut","yoot","1234");
                account.save(tf,tf2,tf3,tf4);
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
            }
        });

        butFR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                researcher = new Researcher("sarayut","Android Developer");
                researcher.save(tf,tf2,tf3);
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");

            }
        });

        butFAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.addNewEmployee("yut","IT","063-436-6971","yut123","123456","Programmer",tf,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11);
            }
        });
    }
}
