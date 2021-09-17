package DailyProgram;

import java.util.Scanner;

public class osp_04_Convert {
    public static void main(String[] args) {
        System.out.println(" WAP to Convert Kilo Meters to Meters");
        int  kilo = 1000;
        System.out.println("Enter Kilo Meter");
        Scanner sc = new Scanner(System.in);
        int meter = sc.nextInt();
        int Converted = meter*kilo;
        System.out.println(Converted+" meters");
    }
}
