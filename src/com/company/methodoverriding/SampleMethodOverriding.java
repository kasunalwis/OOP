package com.company.methodoverriding;

/**
 * Created by kalwis on 6/6/2016.
 */
public class SampleMethodOverriding {
    /*
    If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.

    In other words, If subclass provides the specific implementation of the method that has been provided by one of its parent class,
    it is known as method overriding.

    Usage of Java Method Overriding
        Method overriding is used to provide specific implementation of a method that is already provided by its super class.
        Method overriding is used for runtime polymorphism

    Rules for Java Method Overriding
        method must have same name as in the parent class
        method must have same parameter as in the parent class.
        must be IS-A relationship (inheritance).
     */

    public static void main(String[] args){
        NsbBank nsbBank = new NsbBank();
        SampathBank sampathBank = new SampathBank();
        HsbcBank hsbcBank =  new HsbcBank();

        System.out.println("Interest rate of NSB is: " + nsbBank.getRateOfInterest());
        System.out.println("Interest rate of Sampath is: " + sampathBank.getRateOfInterest());
        System.out.println("Interest rate of HSBC is: " + hsbcBank.getRateOfInterest());
    }
}

class Bank{
    int getRateOfInterest(){return 0;}
}

class NsbBank extends Bank{
    int getRateOfInterest(){return 8;}
}

class SampathBank extends Bank{
    int getRateOfInterest(){return 5;}
}

class HsbcBank extends Bank{
    int getRateOfInterest(){return 12;}
}

