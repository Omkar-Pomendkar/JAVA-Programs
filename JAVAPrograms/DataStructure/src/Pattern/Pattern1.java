package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Pattern1");
        p1(5);
        p3(5);
        p4(5);

    }
    static  void p5(int n)
    {
        for (int row = 0; row < 2 * n; row++) {
            int c = 897889;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    static void p4(int n)
    {
        for (int row= 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);

            }
            System.out.println();

        }
    }
    static void p1(int n)
    {
        for (int row= 1; row <= n ; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void p3(int n)
    {
        for (int row= 1; row <= n ; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
