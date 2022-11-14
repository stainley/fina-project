package edu.lambton.exercise1;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

public class Employee {

    private double salary;
    int hour;
    int rate;

    public Employee() {
        hour = 10;
        rate = 100;
        salary = hour * rate;
    }

    public void getInfo() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println("Salary is:" + numberFormat.format(salary));

        System.out.println("Salary is: CAD" + String.format("$%,3.2f", salary));

    }
}
