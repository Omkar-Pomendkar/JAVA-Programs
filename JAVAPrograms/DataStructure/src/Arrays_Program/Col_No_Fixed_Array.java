package Arrays_Program;

import java.util.Scanner;

public class Col_No_Fixed_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Column Not Fixed Size");
        int [][] ar = {
                {1,2,3,45},
                {1,3},
                {12,34,56}
        };

   //     int [][] ar = new int[3][];
        for (int row = 0; row < ar.length ; row++) {
            for (int col = 0; col < ar[row].length ; col++) {
                System.out.print(ar[row][col] + " ");
            }
            System.out.println();

        }

    }
}
