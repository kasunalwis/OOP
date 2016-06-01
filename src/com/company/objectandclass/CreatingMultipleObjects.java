package com.company.objectandclass;

/**
 * Created by kalwis on 6/1/2016.
 */
public class CreatingMultipleObjects {

    /*We can create multiple objects by one type only as we do in case of primitives.*/

    int length;
    int width;

    void insert(int l,int w){
        length=l;
        width=w;
    }

    void calculateArea(){System.out.println(length*width);}

    public static void main(String args[]){
        CreatingMultipleObjects r1=new CreatingMultipleObjects(),r2=new CreatingMultipleObjects();//creating two objects

        r1.insert(5,5);
        r2.insert(3,15);

        r1.calculateArea();
        r2.calculateArea();
    }
}
