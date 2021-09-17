package Arrays_Program;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println(factorial);

    }
    static  int fact(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }
        else{
            int factorial;
            return factorial = num *(fact(num-1));
        }
    }
}
