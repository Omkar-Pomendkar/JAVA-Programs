package DailyProgram;

import java.util.Scanner;

public class osp_Calculate_Income_Tax {
    public static void main(String[] args) {
        System.out.println("Income Tax paid by an Employee to the Government");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income<250000){

            System.out.println("No tax "+income);
        }
        else if(income>250000 && income<500000 )
        {
             double salary = income * 0.05;
            System.out.println(salary);
        }
        else if (income<500000 && income>100000)
        {
            double salary = income * 0.20;
            System.out.println(salary);
        }
        else if (income>100000)
        {
            double salary = income * 0.30;
            System.out.println(salary);
        }

    }
}
