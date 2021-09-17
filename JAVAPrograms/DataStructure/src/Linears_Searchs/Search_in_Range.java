package Linears_Searchs;

public class Search_in_Range {
    public static void main(String[] args) {
        System.out.println("Search in a range");
        int []arr = {10,20,30,40,50};
        int target = 400;
        int answer = Linear_Search(arr,target,1,3);
        System.out.println(answer);
    }

    static int Linear_Search(int [] arr, int target,int start,int end) {
        if (arr.length == 0) {
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
}