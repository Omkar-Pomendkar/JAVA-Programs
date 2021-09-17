package com.company;

public class osp_CH7_Methods_JAVA {
    static  int logic(int a,int b)
    {   int c;
        if(a>b)
        {
            c = a + b;
        }
        else
        {
            c = a-b;
        }
        return c;
    }



    public static void main(String[] args)
    {
        System.out.println("Methods in Java");

        int c = logic(10,20);

        System.out.println(c);

    }
}
