package Linears_Searchs;

public class Searching_in_a_range {
    public static void main(String[] args) {
        System.out.println("Searching in a Range");
        int[] num11 = {-12,34,-56,78,56};
        int target = -56;
        int ans = linear_search(num11,target,1,3);
        System.out.println(ans);
    }
    static int linear_search(int[] num11,int target,int start,int end)
    {
        if(num11.length == 0)
        {
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element = num11[i];
            if(element == target)
            {
                return element;
            }
        }
        return -1;
    }
}
