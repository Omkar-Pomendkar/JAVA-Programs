package Pattern;
/*
PATTERN TO PRINT
* * * * *
* * * *
* * *
* *
*

 */
public class Star {
    public static void main(String[] args) {
        System.out.println("Start Pattern"); // row
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--)    //column
             {
                System.out.print("*");
            }
            System.out.println("");


        }
    }
}
