package Errors_Exception;


import java.util.Scanner;
class MyEsception extends Exception
{
    @Override
    public String toString() {
        return super.toString()+"I am a Exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"I am a Message";
    }
}
public class MyException {
    public static void main(String[] args) {
        System.out.println("Creating your own Exception");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        if(a>10)
        {
            try {
                    //throw new ArithmeticException("This a Exception");
                    throw new MyEsception();
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println(e.toString());
            }
        }
    }
}
