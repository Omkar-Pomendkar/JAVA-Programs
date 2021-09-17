package Practice;

public class Armstrong {
    //153 = 1^3 + 5^3 + 3^3 = Value
    public static void main(String[] args) {
        System.out.println("Armstrong Number or Not");
        int n = 153; int sum =0;
        while(n>0)
        {
            int rem = n % 10;
            int cube = rem;
            //int sum += cube;
            n = n/10;
        }
    }
}
