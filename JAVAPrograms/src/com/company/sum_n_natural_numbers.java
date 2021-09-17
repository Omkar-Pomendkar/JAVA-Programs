package com.company;

public class sum_n_natural_numbers {

    static int sum(int num)
    {
        if(num == 1)
        {
            return 1;
        }
        else
        {
            return num+sum(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("First N Natural Numbers");
        System.out.println(sum(6));
    }
}
