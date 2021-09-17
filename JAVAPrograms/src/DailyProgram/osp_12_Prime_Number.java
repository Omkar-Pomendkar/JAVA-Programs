package DailyProgram;

public class osp_12_Prime_Number {
    public static void main(String[] args) {
        System.out.println("Prime Number");
        int i,num = 7,temp = 0;
        for (i=2;i<=num-1;i++)
        {
            if(num%i == 0)
            {
                temp = temp + 1;
            }
        }
        if (temp>0)
        {
            System.out.println("It is not a prime Number");
        }
        else
        {
            System.out.println("It is prime number");
        }
    }
}