package DailyProgram;

import java.util.Scanner;

public class osp_02_CGPA {
    // Write a Java Program to Calculate CGPA using marks of 3 Subject
    public static void main(String[] args) {
        System.out.println("CGPA Calculator");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int Average = (m1+m2+m3)/3;
        int Total = m1+m2+m3;
        int Percentage = (Total*100)/300;
        System.out.println(Average);
        System.out.println(Percentage);
        System.out.println(Total);
    }
}
