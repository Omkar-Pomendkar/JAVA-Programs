package Recursion;

public class Greatting {
    public static void main(String[] args) {
        message();
    }

    static void message()
    {
        System.out.println("Hello World");
        message1();
    }
    static void message1()
    {
        System.out.println("Hello World_1");
        message2();
    }
    static void message2()
    {
        System.out.println("Hello World_2");
        message3();
    }
    static void message3()
    {
        System.out.println("Hello World_3");
        message4();
    }
    static void message4()
    {
        System.out.println("Hello World_4");
    }
}
