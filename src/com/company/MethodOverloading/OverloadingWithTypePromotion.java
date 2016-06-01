package com.company.methodoverloading;

/**
 * Created by kalwis on 6/1/2016.
 */
public class OverloadingWithTypePromotion {
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b){System.out.println(a + b);}

    public static void main(String args[]){
        OverloadingWithTypePromotion obj=new OverloadingWithTypePromotion();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,30);
    }

    /*
    If there are matching type arguments in the method, type promotion is not performed.
    */

    /*
    If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.

    class OverloadingWithTypePromotion{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String args[]){
    OverloadingWithTypePromotion obj=new OverloadingWithTypePromotion();
    obj.sum(20,20);//now ambiguity
    }
    */
}
