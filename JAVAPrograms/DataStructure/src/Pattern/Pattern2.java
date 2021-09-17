package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Pattern1");
        p1(5);

    }
    static void p1(int n)
    {
        for (int row = 1; row <= n ; row++) {
            // for Every row, run col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
