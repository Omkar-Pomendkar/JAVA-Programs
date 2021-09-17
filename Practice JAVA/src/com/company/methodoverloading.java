package com.company;


// Method Overloading




public class methodoverloading {
    static void joke(){
        System.out.println("I invented a word Plagarism");
    }
    static void foo()
    {
        System.out.println("Happy Birthday Bro");
    }
    static void foo(int a, int b) // here a & b are Parameters
    {
        System.out.println("Happy Birthday " + a + " Bro");
        System.out.println("Happy Birthday " + b + " Bro");
    }
    public static void main(String[] args) {
        //foo(3000);
        foo();
        foo(10,20); /*  here a & b are arguments
        */

    }
}
