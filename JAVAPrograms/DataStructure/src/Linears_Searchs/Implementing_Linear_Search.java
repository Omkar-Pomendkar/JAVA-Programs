package Linears_Searchs;

public class Implementing_Linear_Search {
    public static void main(String[] args) {
        System.out.println("Implementing Linear Search");
        int[] arr = {10,20,21,-45,6,-7,5};
        int target = 212;
        int ans = LinearSearch(arr,target,1,4);
        System.out.println(ans);
    }
    static int LinearSearch(int []arr,int target,int start,int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int element : arr) {
            if (target == element) {
                return element;
            }

        }
        return -1;
    }
}
