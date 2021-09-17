package Arrays;


import java.util.Scanner;

public class osp_Check_Integer_Present_Array {
    public static void main(String[] args) {
        System.out.println("WAP to Check whether a given Integer is Present in an Array or not");
        int []ars = {10,20,30,40,50,60,70};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean IsinArray =false;
        for (int element:ars) {
            if (num == element) {
                IsinArray = true;
                break;
            }
        }
         if (IsinArray)
         {
             System.out.println("Number is Present");
         }
         else
         {
             System.out.println("Number is not Present");
         }
        }
    }
