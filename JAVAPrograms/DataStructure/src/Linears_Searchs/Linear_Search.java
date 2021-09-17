package Linears_Searchs;

import org.jetbrains.annotations.Contract;

public class Linear_Search {
    public static void main(String[] args) {
        System.out.println(" Linear Search");
        int [] nums = {10,20,-9,45,78,12,34};
        int target = -9;
        int ans = Linear_Search(nums,target);
        System.out.println(ans);
        // if item found return the index
        // if not found return -1
    }
    static int Linear_Search(int [] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            // check for every element if it is equal  =  target
            if (element == target) {
                return element;
            }
        }
        return -1; // if no element found in an Array

    }
    //@Contract(pure = true)
//    static int Linear_Search(int [] arr, int target)
//    {
//        if(arr.length == 0)
//        {
//            return -1;
//        }
//
//        // run a for loop
//        for (int index = 0; index <arr.length ; index++) {
//            // check for every element if it is equal  =  target
//            int element = arr[index];
//            if(element == target)
//            {
//                return index;
//            }
//        }
//        return -1; // if no elemnt found in an Array
//
//    }
}
