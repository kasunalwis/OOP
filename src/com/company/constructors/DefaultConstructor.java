package com.company.constructors;

/**
 * Created by kalwis on 6/1/2016.
 */
public class DefaultConstructor {

    /*
    Constructor in java is a special type of method that is used to initialize the object.

    Java constructor is invoked at the time of object creation. It constructs the values i.e.
    provides data for the object that is why it is known as constructor.

    Rules for creating java constructor

    There are basically two rules defined for the constructor.
        Constructor name must be same as its class name
        Constructor must have no explicit return type

    A constructor that have no parameter is known as default constructor.*/

    DefaultConstructor(){System.out.println("Bike is created");}

    public static void main(String args[]){
        DefaultConstructor b=new DefaultConstructor();
    }

    /*
    If there is no constructor in a class, compiler automatically creates a default constructor.

    Default constructor provides the default values to the object like 0, null etc. depending on the type.
     */
}
