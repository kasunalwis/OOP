package com.company.thiskeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class SampleThisKeyword {
    /*
    In the above example, parameter (formal arguments) and instance variables are same
    that is why we are using this keyword to distinguish between local variable and instance variable.

    If local variables(formal arguments) and instance variables are different, there is no need to use this keyword
    */
    int id;
    String name;

    SampleThisKeyword(int id,String name){
        this.id = id;
        this.name = name;
    }
    void display(){System.out.println(id+" "+name);}
    public static void main(String args[]){
        SampleThisKeyword s1 = new SampleThisKeyword(111,"Karan");
        SampleThisKeyword s2 = new SampleThisKeyword(222,"Aryan");
        s1.display();
        s2.display();
    }
}
