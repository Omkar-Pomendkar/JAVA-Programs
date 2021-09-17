package Arrays_Program;

//import Arrays_Program.Arrays;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        System.out.println("Searching in 2 D Array");
        // here the array is not initialized over here
        int [][] arr = {
                {12,45,6},
                {78,56,8,9,1},
                {65,56,41,25,38},
                {15,6,81,45,28,78},
        };
        int target = 28;
        int [] ans  = search(arr,target); // Format of return value is {row,Col}
        System.out.println(Arrays.toString(ans));
    }
    // here in this program it is returning an Array
    static int[] search(int[][] arr ,int target)
    {
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] == target)
                {
                    // so we are Creating an Object over Here
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1, -1};
    }
}
