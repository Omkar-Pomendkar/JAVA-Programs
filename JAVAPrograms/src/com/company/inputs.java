package com.company;

import java.util.Scanner;
public class inputs {
    public static void main(String[] args)
    {
        System.out.println("Hello java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String a = sc.nextLine();
        System.out.println(a);
        System.out.println("enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 + num2;
        int result1 = num1 - num2;
        int result2 = num1 / num2;
        int result3 = num1 * num2;
        System.out.println("Addition is "+ result);
        System.out.println("Substraction "+ result1);
        System.out.println("Multiplication "+ result2);
        System.out.println("Division"+ result3);

    }

}
