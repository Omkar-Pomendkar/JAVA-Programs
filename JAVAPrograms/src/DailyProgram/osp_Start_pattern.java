package DailyProgram;

import java.sql.SQLOutput;

public class osp_Start_pattern {
    public static void main(String[] args) {
        System.out.println("Start Pattern");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}