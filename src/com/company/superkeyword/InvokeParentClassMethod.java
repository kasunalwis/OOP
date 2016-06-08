package com.company.superkeyword;

/**
 * Created by kalwis on 6/7/2016.
 */
public class InvokeParentClassMethod {
    /*
    The super keyword can also be used to invoke parent class method.
    It should be used in case subclass contains the same method as parent class as in the example given below:
    */
}

class Person{
    void message(){System.out.println("welcome");}
}

class Student16 extends Person{
    void message(){System.out.println("welcome to java");}

    void display(){
        message();//will invoke current class message() method
        super.message();//will invoke parent class message() method
    }

    public static void main(String args[]){
        Student16 s=new Student16();
        s.display();
    }
}
