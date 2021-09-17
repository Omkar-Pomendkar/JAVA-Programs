package com.company;

import java.util.Scanner;
public class OSP_CH2_PS2_Q3 {
    public static void main(String[] args) {
        System.out.println("To Check wheather the given number is greater then then the user entered Number");
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int num1 = 10 ;
        System.out.println((num>num1)+"User Input is Biggger");
        System.out.println((num<num1)+"User Input is smaller");

    }
}
