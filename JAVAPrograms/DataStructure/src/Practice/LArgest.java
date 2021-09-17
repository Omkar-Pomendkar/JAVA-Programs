package Practice;

import java.util.Scanner;

public class LArgest {
    public static void main(String[] args) {
        System.out.println("Solving Largest Program");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find the Largest of # Numbers

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
