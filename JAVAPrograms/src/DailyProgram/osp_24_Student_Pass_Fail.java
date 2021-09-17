package DailyProgram;

import jdk.jfr.Percentage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class osp_24_Student_Pass_Fail {
    public static void main(String[] args) {
        System.out.println("Check Student Pass or Fail");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1+m2+m3;
        int percentage = (total*100)/300;
       // System.out.println(m1+m2+m3);
         if (m1<33||m2<33||m3<33)
         {
             System.out.println(" Student is Failed " + percentage+"%");
         }
         else if(percentage>40)
         {
             System.out.println("Student is Passed "+ percentage+"%");
         }

    }
}
