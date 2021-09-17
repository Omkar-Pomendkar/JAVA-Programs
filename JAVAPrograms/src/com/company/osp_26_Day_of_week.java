package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class osp_26_Day_of_week {
    public static void main(String[] args) {
        System.out.println("Day of Week ");
        Scanner sc = new Scanner(System.in);

        int ch =  sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}
