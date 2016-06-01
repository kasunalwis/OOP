package com.company.objectandclass;

/**
 * Created by kalwis on 6/1/2016.
 */
public class AnnonymousObjectClass {

    /*
    There are many ways to create an object in java.
    They are:
        By new keyword
        By newInstance() method
        By clone() method
        By factory method etc.
     */

    void fact(int  n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }

    public static void main(String args[]){
        new AnnonymousObjectClass().fact(5);//calling method with annonymous object
    }
}
