package com.company;

public class osp_Varags_java {

    static int Sum(int ...arr)
    {int result = 0;
        //return arr;
        for (int e:arr) {

            result += e;

        }
        return result;
    }
//    static int Sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }

    public static void main(String[] args) {
        System.out.println("VarArgs in JAVA");
        System.out.println("Sum is"+Sum(10,20));
        System.out.println("Sum is"+Sum(10,20,50));
    }
}
