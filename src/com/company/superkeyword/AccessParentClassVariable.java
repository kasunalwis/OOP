package com.company.superkeyword;

/**
 * Created by kalwis on 6/7/2016.
 */
public class AccessParentClassVariable {
    /*
    The super keyword in java is a reference variable that is used to refer immediate parent class object.

    Whenever you create the instance of subclass, an instance of parent class is created implicitly
    i.e. referred by super reference variable.


    In the above example Vehicle and Bike both class have a common property speed. Instance variable of current class is refered
    by instance bydefault, but I have to refer parent class instance variable that is why we use super keyword to distinguish
    between parent class instance variable and current class instance variable.
    */
}

//example of super keyword

class Vehicle{
    int speed=50;
}

class Bike4 extends Vehicle{
    int speed=100;

    void display(){
        System.out.println(super.speed);//will print speed of Vehicle now
    }
    public static void main(String args[]){
        Bike4 b=new Bike4();
        b.display();

    }
}
