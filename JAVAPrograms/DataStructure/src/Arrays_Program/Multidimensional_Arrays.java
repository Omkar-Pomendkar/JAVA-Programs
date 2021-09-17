package Arrays_Program;

import java.util.Scanner;
import java.util.Arrays;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        System.out.println("Multidimensional Arrays");
        Scanner sc = new Scanner(System.in);
        int[][] arrs = new int[3][3];
//                                ROW COL
        // Input Value in Array
        for (int row = 0; row < arrs.length; row++) {
            for (int col = 0; col < arrs[row].length; col++) {
                arrs[row][col] = sc.nextInt();
            }
        }

        // Printing 2 Dimensional Array
        for (int row = 0; row < arrs.length; row++) {
            System.out.println(Arrays.toString(arrs[row]));
//            for (int col = 0; col < arrs[row].length ; col++) {
//                //arrs[row] [col] = sc.nextInt();
//                System.out.print(arrs[row][col] + " ");
//            }
//            System.out.println();
//        }
        }
        for (int [] a: arrs) {
            System.out.println(Arrays.toString(a));
            
        }
    }
}
