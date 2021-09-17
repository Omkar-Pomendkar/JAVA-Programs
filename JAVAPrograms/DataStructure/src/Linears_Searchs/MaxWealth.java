package Linears_Searchs;

public class MaxWealth {
    public static void main(String[] args) {
    }
    public int maximumWealth(int[][] accounts)
    {   int ans = Integer.MIN_VALUE;
        //person = row
        //account = col
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                //when u start new column ,take a new sum of that row
                sum += accounts[person][account];
                if(sum>ans)
                {
                    ans = sum;
                }

            }

        }
        return ans;
    }
}
