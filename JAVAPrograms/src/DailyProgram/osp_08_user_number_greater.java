package DailyProgram;

import java.util.Scanner;

public class osp_08_user_number_greater {
    public static void main(String[] args) {
        System.out.println("Entered number is greater or not");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>100){
            System.out.println("User Number is Greater");
        }
        else
        {
            System.out.println(" User Number is Lesser");
        }
    }
}
