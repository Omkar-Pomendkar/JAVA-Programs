package com.company;

public class summethod {


     int sum(int a  , int b )
    {
        int c;
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 10 ;
        int b = 2000;
        int c ;
        summethod obj = new summethod(); //method invocation using object Creaation
        c = obj.sum(a,b);
        System.out.println(c);

    }
}
