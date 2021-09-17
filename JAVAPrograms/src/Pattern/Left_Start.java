package Pattern;

public class Left_Start {


    public static void main(String[] args) {
        System.out.println("Star Pattern");

        /*

        *
        * *
        * * *
        * * * *
        * * * *  *
        */
        //i = rows
        //j = columns
        for(int i =0 ;i<=4;i++)  // rows
        {
            for (int j = 0; j <= 4; j++)  // columns
            {
                if(j<=i) {
                    System.out.print("*");
                }
                else {
                    System.out.print("");
                }
              }
            System.out.println();
        }
    }
}
