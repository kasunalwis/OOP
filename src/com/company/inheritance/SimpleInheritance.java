package com.company.inheritance;

/**
 * Created by kalwis on 6/2/2016.
 */
public class SimpleInheritance {
    /*
    Inheritance represents the IS-A relationship, also known as parent-child relationship.

    The extends keyword indicates that you are making a new class that derives from an existing class.

    In the terminology of Java, a class that is inherited is called a super class. The new class is called a subclass.
    */
}

class Employee{

    float salary=40000;
}

class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
