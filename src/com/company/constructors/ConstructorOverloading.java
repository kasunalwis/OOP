package com.company.constructors;

/**
 * Created by kalwis on 6/1/2016.
 */
public class ConstructorOverloading {
    /*
    Constructor overloading is a technique in Java in which a class can have any number of constructors that differ in parameter lists.
    The compiler differentiates these constructors by taking into account the number of parameters in the list and their type.
    */

    int id;
    String name;
    int age;

    ConstructorOverloading(int i,String n){
        id = i;
        name = n;
    }

    ConstructorOverloading(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        ConstructorOverloading s1 = new ConstructorOverloading(111,"Karan");
        ConstructorOverloading s2 = new ConstructorOverloading(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
