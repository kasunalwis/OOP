package com.company.objectandclass;

/**
 * Created by kalwis on 6/1/2016.
 */
public class SimpleExampleOfObjectAndClass {

    /*
    Object is an instance of a class. Class is a template or blueprint from which objects are created.
    So object is the instance(result) of a class.

    An object has three characteristics:

    state: represents data (value) of an object.
    behavior: represents the behavior (functionality) of an object such as deposit, withdraw etc.
    identity: Object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user.
    But,it is used internally by the JVM to identify each object uniquely.

    For Example: Pen is an object. Its name is Reynolds, color is white etc. known as its state.
    It is used to write, so writing is its behavior

    /* In this example, we are creating the two objects of 'SimpleExampleOfObjectAndClass' class and initializing the value
    to these objects by invoking the insertRecord method on it. Here, we are displaying the state (data) of the
    objects by invoking the displayInformation method.*/

    int rollno;
    String name;

    void insertRecord(int r, String n){  //method
        rollno=r;
        name=n;
    }

    void displayInformation(){System.out.println(rollno+" "+name);}//method

    public static void main(String args[]) {
        SimpleExampleOfObjectAndClass s1 = new SimpleExampleOfObjectAndClass();
        SimpleExampleOfObjectAndClass s2 = new SimpleExampleOfObjectAndClass();

        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");

        s1.displayInformation();
        s2.displayInformation();
    }

    /*
    Instance variable in Java - A variable that is created inside the class but outside the method, is known as instance variable.
    Instance variable doesn't get memory at compile time.It gets memory at runtime when object(instance) is created.
    That is why, it is known as instance variable.

    Method in Java - In java, a method is like function i.e. used to expose behaviour of an object.

    Advantage of Method
        Code Reusability
        Code Optimization

    new keyword - The new keyword is used to allocate memory at runtime.*/

}
