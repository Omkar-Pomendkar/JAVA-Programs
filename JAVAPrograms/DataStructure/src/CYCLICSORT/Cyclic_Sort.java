package CYCLICSORT;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        System.out.println("Learning to Code Cyclic Sort");
        int[] arr = {7,8,9,4,5,6,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void sort(int[] arr) {
        //Algorithim
         /*
         1) Putting Value at Specific Index Location
         2) eg 3 = 3-1 = 2
         3) As Index Starts From Zero 0.
         4) Using While loop for Checking till N.
          */
         int i = 0;
         while(i < arr.length)
         {
             int correct = arr[i]-1;
             if(arr[i] != arr[correct])
             {
                 swap(arr,i,correct);
             }
             else
             {
                 i++;
             }

         }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
