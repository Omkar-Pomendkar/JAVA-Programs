package Errors_Exception;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        System.out.println("Exception");
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 10;
        marks[2] = 10;
//        marks[0] = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Index");
           int index = sc.nextInt();

        System.out.println("Enter the number you want to divide value with");
        int number = sc.nextInt();

        try {
            System.out.println("Array index is" + marks[index]);
            System.out.println("The number divided arr = value/number" + marks[number/index]);
        }
        catch (ArrayIndexOutOfBoundsException e )
        {
            System.out.println("ArrayIndexOutOfBoundsException Occured");
            System.out.println(e);
        }
        catch (ArithmeticException e )
        {
            System.out.println("ArithmeticException Occured");
            System.out.println(e);
        }
        System.out.println("End of the Program");

    }
}
