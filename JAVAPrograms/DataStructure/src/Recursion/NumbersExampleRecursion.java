package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a Number & print it
        print(1);
    }
    static void print(int n)
    {
        // Special Case
        // BAse Condition
        if(n == 5)
        {
            System.out.println(n);
            return;
        }
        //print First Five Numbers 1,2,3,4,5
        System.out.println(n);
        print(n+1);
    }

}
