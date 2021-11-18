package BUBBLE_SORT;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("Implementing Bubble Sort");
        int [] arr = {16,2,53,4,95};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int []arr)
    {   boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step each , max item will come at last respective index
            for (int j = 1; j < arr.length -i;  j++)   //j<arr.length -1
            {
                // swap if the item is smaller then its previous item
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if u did not swapped for a particular value of i it means the Array is Sorted
            if(!swapped)
                break;
        }

    }
}
