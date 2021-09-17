package com.company;

import java.util.Scanner;
public class input {

    public static void main(String[] args)
    {
        System.out.println("Taking input from User");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println(name);
        System.out.println("Enter first Number");
        int a = scan.nextInt();
        System.out.println("Enter second Number");
        int b = scan.nextInt();

        int sum = a+b;
        System.out.println("Result is");
        System.out.println(sum);

    }

}
