package Linears_Searchs;

public class FindMin {
    public static void main(String[] args) {
        System.out.println("Finding Minimum Number");
        int [] arr = {13,24,56,98,4,1,55};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    //assume arr.length != 0
    // Return the Minimum Value
    static int min(int[] arr)
    {
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    // Maximum Element in an Array
    static int max(int[] arr)
    {
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
