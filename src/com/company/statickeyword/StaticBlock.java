package com.company.statickeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class StaticBlock {
    /*
    Is used to initialize the static data member.

    It is executed before main method at the time of classloading.

    */

    static {
        System.out.println("static block is invoked");
    }

    public static void main(String args[]) {
        System.out.println("Hello main");
    }

    /*
    Q) Can we execute a program without main() method?

    Ans) Yes, one of the way is static block but in previous version of JDK not in JDK 1.7.
    */
}
