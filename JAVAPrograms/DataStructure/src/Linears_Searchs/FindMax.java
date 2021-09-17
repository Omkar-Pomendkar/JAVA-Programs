package Linears_Searchs;

public class FindMax {
    public static void main(String[] args) {
        System.out.println("Finding Maximum number in an Array");
        int [] arr = {23,56,1,65,34,90,99,12};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static  int max(int [] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > ans)
            {
                ans = arr[i];
            }

        }
        return ans;
    }

    static  int min(int [] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans)
            {
                ans = arr[i];
            }

        }
        return ans;
    }
}
