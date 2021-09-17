package com.company;

public class method {
    static int logic (int x ,int y){
        int z;
        if(x>y)
        {
            z = x+y;
        }
        else
        {
            z = (x+y)*5;
        }
        return  z;
    }
    public static void main(String[] args) {
        System.out.println("Method in java");
        int a = 10 ;
        int b = 20 ;
        int c ;
        c = logic(a,b);
        System.out.println(c);
    }
}
