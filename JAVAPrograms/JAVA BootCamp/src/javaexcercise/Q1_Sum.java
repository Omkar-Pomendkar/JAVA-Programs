package javaexcercise;

import java.util.Scanner;

public class Q1_Sum {
//    Q : Write a Program to sum 3 Numbers
public static void main(String[] args) {
    System.out.println("Sum 3 Numbers");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int Result = (num1+num2+num3);
    System.out.println(Result);
}
}
