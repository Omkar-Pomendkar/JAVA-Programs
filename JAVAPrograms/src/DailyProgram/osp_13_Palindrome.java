package DailyProgram;

public class osp_13_Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome Number");
        int num = 454,temp,rev=0,rem;
        temp = num;
        while(num>0)
        {
            rem = num%10;
            rev= rev*10+rem;
        }
    }
}
