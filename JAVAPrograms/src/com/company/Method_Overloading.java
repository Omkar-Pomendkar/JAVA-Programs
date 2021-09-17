package com.company;

public class Method_Overloading {
    static void telljoke(){
        System.out.println(" New Joke");
    }

    static void foo()
    {
        System.out.println("Good Morning ");
    }

    static void foo(int a)
    {
        System.out.println("Good Morning "+ a + " Bro");
    }

    static void foo(int a, int b)
    {
        System.out.println("Good Morning "+ a + " Bro" + "Good Morning "+ b + " Bro");
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        foo(5000);
        foo();
        foo(200,300);
    }
}
