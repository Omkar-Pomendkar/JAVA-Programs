package Recursion;

public class Recurssion {
    public static void main(String[] args) {
        System.out.println("Learning Recursion");
        message(5);
    }

     static void message(int n) {
        System.out.println(n);
        message(n+1);
    }
}
