package CYCLICSORT;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        System.out.println("Cyclic Sort");
        int [] arr = {5,4,3,2,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int []arr)
    {
        int i = 0;
        while (i < arr.length) // it wil search from Zero to N
        {
            int correct = arr[i]-1;  // putting element at Correct index
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
