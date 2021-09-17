package DailyProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class osp_Multiplication_table_n {
    public static void main(String[] args) {
        System.out.println("Multiplication table of N");
        System.out.println("Please enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = 10;
        for(int i = 1 ;i <= t ; i++)
        {
            System.out.println(num+"x"+i+"="+(num * i));
        }
    }
}
