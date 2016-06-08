package com.company.encapsulation;

/**
 * Created by kalwis on 6/6/2016.
 */
public class SampleEncapsulation {
  /*
    Encapsulation in java is a process of wrapping code and data together into a single unit,
    for example capsule i.e. mixed of several medicines.

    We can create a fully encapsulated class in java by making all the data members of the class private.
    Now we can use setter and getter methods to set and get the data in it.

    The Java Bean class is the example of fully encapsulated class.

    Advantage of Encapsulation in java
        By providing only setter or getter method, you can make the class read-only or write-only.
        It provides you the control over the data. Suppose you want to set the value of id i.e.
        greater than 100 only, you can write the logic inside the setter method.
  */

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}

class Test{
    public static void main(String[] args){
        SampleEncapsulation s=new SampleEncapsulation();
        s.setName("vijay");
        System.out.println(s.getName());
    }
}
