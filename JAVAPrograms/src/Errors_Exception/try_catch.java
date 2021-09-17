package Errors_Exception;

public class try_catch {
    public static void main(String[] args) {
        System.out.println("try & catch");
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("We are not able to divide");
            System.out.println(e);
        }

    }
}
