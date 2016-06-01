package com.company.thiskeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class InvokeCurrentClassMethod {
    /*
    You may invoke the method of the current class by using the this keyword.
    If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
    */

    void m(){
        System.out.println("method is invoked");
    }
    void n(){
        this.m();//no need because compiler does it for you.
    }
    void p(){
        n();//complier will add this to invoke n() method as this.n()
    }
    public static void main(String args[]){
        InvokeCurrentClassMethod s1 = new InvokeCurrentClassMethod();
        s1.p();
    }
}
