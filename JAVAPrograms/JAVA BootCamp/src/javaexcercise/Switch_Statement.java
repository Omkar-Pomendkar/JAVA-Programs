package javaexcercise;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        System.out.println("Switch Statements");
        Scanner sc = new Scanner(System.in);
//        String fruits = sc.next();
//
//        switch (fruits) {
//            case "Mango" -> System.out.println("King of Fruit");
//            case "Orange" -> System.out.println("Orange fruit");
//            default -> System.out.println("Please Enter a Valid Fruit");
//        }
            int day = sc.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else {
            if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            }
        }
    }
}
