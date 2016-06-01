package com.company.constructors;

/**
 * Created by kalwis on 6/1/2016.
 */
public class ParameterizedConstructor {
    /*
    A constructor that have parameters is known as parameterized constructor.

    Why use parameterized constructor? Parameterized constructor is used to provide different values to the distinct objects.
     */

    int id;
    String name;

    ParameterizedConstructor(int i,String n){
        id = i;
        name = n;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        ParameterizedConstructor s1 = new ParameterizedConstructor(111,"Karan");
        ParameterizedConstructor s2 = new ParameterizedConstructor(222,"Aryan");
        s1.display();
        s2.display();
    }
}
