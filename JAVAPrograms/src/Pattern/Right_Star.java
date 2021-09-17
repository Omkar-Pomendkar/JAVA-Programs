package Pattern;

import javax.swing.*;

/*
       *
     * *
   * * *
  * * * *
* * * * *

 */
public class Right_Star {
    public static void main(String[] args) {
        System.out.println("Right Star Pattern");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--)    //column
            {
                System.out.print("*");
            }
            System.out.println("");


        }
    }
}


