package com.company.methodoverloading;

/**
 * Created by kalwis on 6/1/2016.
 */
public class OverloadingbyChangingDataType {
    /*
    In this example, we have created two overloaded methods that differs in data type.
    The first sum method receives two integer arguments and second sum method receives two double arguments.
     */

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        OverloadingbyChangingDataType obj = new OverloadingbyChangingDataType();
        obj.sum(10.5, 10.5);
        obj.sum(20, 20);
    }
}
