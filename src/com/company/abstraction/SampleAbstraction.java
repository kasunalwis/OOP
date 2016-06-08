package com.company.abstraction;

/**
 * Created by kalwis on 6/8/2016.
 */
public class SampleAbstraction {
    /*
    A class that is declared with abstract keyword, is known as abstract class in java.
    It can have abstract and non-abstract methods (method with body).

    Abstraction is a process of hiding the implementation details and showing only functionality to the user.

    Another way, it shows only important things to the user and hides the internal details for example sending sms,
    you just type the text and send the message. You don't know the internal processing about the message delivery.
    */

    public static void main(String args[]) {
        Bank b = new PNB();//if object is PNB, method of PNB will be invoked
        int interest = b.getRateOfInterest();
        System.out.println("Rate of Interest is: " + interest + " %");
    }
}

    abstract class Bank{
        abstract int getRateOfInterest();
    }

    class SBI extends Bank{
        int getRateOfInterest(){return 7;}
    }

    class PNB extends Bank{
        int getRateOfInterest(){return 9;}
    }
