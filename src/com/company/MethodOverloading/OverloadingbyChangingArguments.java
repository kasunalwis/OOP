package com.company.MethodOverloading;

/**
 * Created by kalwis on 6/1/2016.
 */
public class OverloadingbyChangingArguments {
    /*
    If a class have multiple methods by same name but different parameters, it is known as Method Overloading.

    If we have to perform only one operation, having same name of the methods increases the readability of the program.
     */

    /*
    In this example, we have created two overloaded methods, first sum method performs addition of two numbers and
    second sum method performs addition of three numbers.
    */

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String args[]) {
        OverloadingbyChangingArguments obj = new OverloadingbyChangingArguments();
        obj.sum(10, 10, 10);
        obj.sum(20, 20);
    }

    /*
    Method Overloaing is not possible by changing the return type of method
     */
}
