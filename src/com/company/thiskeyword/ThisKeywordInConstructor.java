package com.company.thiskeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class ThisKeywordInConstructor {
    /*
    The this() constructor call can be used to invoke the current class constructor (constructor chaining).
    This approach is better if you have many constructors in the class and want to reuse that constructor.
    */

    int id;
    String name;
    String city;

    ThisKeywordInConstructor(int id,String name){
        this.id = id;
        this.name = name;
    }
    ThisKeywordInConstructor(int id,String name,String city){
        this(id,name);//now no need to initialize id and name
        this.city=city;
    }
    void display(){System.out.println(id+" "+name+" "+city);}

    public static void main(String args[]){
        ThisKeywordInConstructor e1 = new ThisKeywordInConstructor(111,"karan");
        ThisKeywordInConstructor e2 = new ThisKeywordInConstructor(222,"Aryan","delhi");
        e1.display();
        e2.display();
    }

    /*
    Rule: Call to this() must be the first statement in constructor.
    */
}
