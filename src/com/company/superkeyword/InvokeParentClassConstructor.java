package com.company.superkeyword;

/**
 * Created by kalwis on 6/7/2016.
 */
public class InvokeParentClassConstructor {
}

class MotorVehicle{
    MotorVehicle(){System.out.println("Vehicle is created");}
}

class Bike5 extends MotorVehicle{
    Bike5(){
        super();//will invoke parent class constructor
        System.out.println("Bike is created");
    }
    public static void main(String args[]){
        Bike5 b=new Bike5();

    }
}
