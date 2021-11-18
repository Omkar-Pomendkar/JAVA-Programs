package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //System.out.println("Fibonnaci Number");
        int ans = Fib(50);  // 50 Expotential Time Complexity
        System.out.println(ans);
    }
    static int Fib(int n)
    {
        //base condition
        if(n < 2)
        {
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }
}
