package Arrays_Program;
import java.util.Arrays;
/*LOGIC

 */


public class MaxIn2DArray {
    public static void main(String[] args) {
        System.out.println("Finding Maximum & Minimum Element in 2D Array");
        int [][] number = {
                {12,43,21,45,76},
                {99,45,1,78},
                {34,9,45,76},
        };
        int target = 5;
//
        //int[] ans  = search(number,target); // Format of return value is {row,Col}
       // System.out.println(Arrays.toString());
        System.out.println(max(number,target));
        System.out.println(min(number,target));

    }
    static int max(int[][] number, int target)
    {   int max = Integer.MIN_VALUE;
        for (int row = 0; row < number.length ; row++) {
            for (int col = 0; col < number[row].length ; col++) {
                if(number[row][col] > max)
                {
                    max = number[row][col];
                }

            }

        }
        return max;
    }


    static int min(int[][] number, int target)
    {   int min = Integer.MAX_VALUE;
        for (int row = 0; row < number.length ; row++) {
            for (int col = 0; col < number[row].length ; col++) {
                if(number[row][col] < min)
                {
                    min = number[row][col];
                }

            }

        }
        return min;
    }
}
