package DailyProgram;
// WAP to search factorial of a Number
// factorial of 0 = 1 & 1 = 1

public class factorial {

    static int fact(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }
        else
        {
            return num*fact(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial of a Number");
        System.out.println(fact(4));
    }
}
