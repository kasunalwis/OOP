package com.company.statickeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class StaticVariable {
    /*
    If you declare any variable as static, it is known static variable.

    The static variable can be used to refer the common property of all objects (that is not unique for each object)
    e.g. company name of employees,college name of students etc.
    The static variable gets memory only once in class area at the time of class loading.
     */

    static int count=0;//will get memory only once and retain its value

    StaticVariable(){
        count++;
        System.out.println(count);
    }

    public static void main(String args[]){

        StaticVariable c1=new StaticVariable();
        StaticVariable c2=new StaticVariable();
        StaticVariable c3=new StaticVariable();

    }
}
