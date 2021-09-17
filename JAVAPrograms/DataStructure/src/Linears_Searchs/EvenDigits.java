package Linears_Searchs;

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println("Even Digits Number");
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(54));
    }
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    // function to check number contains even no of Digits
     static boolean even(int num) {
        int noofDigits = digits(num);
//         if(noofDigits % 2 == 0)
//         {
//             return true;
//         }
//            return false;
         return noofDigits % 2 == 0;
    }
    static int digits2(int num)
    {
        if(num < 0)
            num = num * -1;
        return (int)(Math.log10(num) + 1);
    }
    //count no of digits in a Number
    static int digits(int num)
    {
        int count = 0;
        while (num > 0)
        {
            count++;
            num = num/10;
        }
        return count;
    }

}