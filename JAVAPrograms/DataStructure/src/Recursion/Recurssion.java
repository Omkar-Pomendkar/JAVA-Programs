package Recursion;
// RECURSION - Function Calling itsSelf
// Why - It helps us to sole bigger & Complex Problem in Simple Way
//
public class Recurssion {
    public static void main(String[] args) {
        // write a function thata takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5
       // System.out.println("Learning Recursion");
        print(0);
    }

     static void print(int n) {

        if(n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
         // if u are calling a function again  & again
        print(n+1);
    }
}
