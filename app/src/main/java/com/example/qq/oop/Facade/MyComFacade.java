package com.example.qq.oop.Facade;

import android.widget.TextView;

import com.example.qq.oop.Facade.hr.Employee;
import com.example.qq.oop.Facade.noc.Account;
import com.example.qq.oop.Facade.rd.Researcher;

/**
 * Created by Sarayut on 14/7/2561.
 */
public class MyComFacade {

    public static void addNewEmployee(String name, String department, String telNo, String accountName, String password, String interestingField, TextView t, TextView t2, TextView t3, TextView t4, TextView t5, TextView t6, TextView t7, TextView t8, TextView t9, TextView t10, TextView t11) {

        Employee employee = new Employee(name, department, telNo);
        employee.save(t, t2, t3, t4);

        Account account = new Account(name, accountName, password);
        account.save(t5, t6, t7, t8);

        Researcher researcher = new Researcher(name, interestingField);
        researcher.save(t9, t10, t11);
    }
}
