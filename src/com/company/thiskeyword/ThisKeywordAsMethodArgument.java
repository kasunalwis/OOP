package com.company.thiskeyword;

/**
 * Created by kalwis on 6/1/2016.
 */
public class ThisKeywordAsMethodArgument {
    /*
    The this keyword can also be passed as an argument in the method. It is mainly used in the event handling
    */

    void m(ThisKeywordAsMethodArgument obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }

    public static void main(String args[]){
        ThisKeywordAsMethodArgument s1 = new ThisKeywordAsMethodArgument();
        s1.p();
    }
}
