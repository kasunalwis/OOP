package com.company.thiskeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class ThisKeywordReturnCurrentClassInstance {
    /*
    The this keyword can be used to return current class instance
    */

    public static void main(String args[]){
        new TestA().getA().msg();
    }
}

class TestA{
    TestA getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}