package Recursion;

public class BS {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int [] arr = {12,34,563,67,5};
        int target = 50;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    static int binarySearch(int [] arr, int target,int start,int end)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start +(end-start)/2;
        if(arr[mid] == target)
        {
            return mid;
        }
        if(target > arr[mid])
        {
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);

    }
}
