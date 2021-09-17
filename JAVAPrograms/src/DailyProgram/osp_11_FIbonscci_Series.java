package DailyProgram;

public class osp_11_FIbonscci_Series {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        int n1 = 0,n2 = 1,i,count =10;
        System.out.println(n1+"\n"+n2);

        for (i=2;i<count;i++)
        {
            int  n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;


        }

    }
}
