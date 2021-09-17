package Pattern;

public class Pattern12345 {
    public static void main(String[] args) {
        System.out.println("12345 Pattern");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {

                System.out.print(j+"");

            }
            System.out.println(" ");

        }
    }
}
