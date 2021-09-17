package Arrays;

public class osp_Average_Array {
    public static void main(String[] args) {
        System.out.println("Calculate Average marks from an Array");
        int [] marks = {10,20,30,40,50};
        //int len = marks.length;
        int sum=0;
        int avg = 0;
        for(int element: marks)
        {
            sum = sum+element;
            avg = sum/ marks.length;

        }
        System.out.println("Average  : "+avg);
        System.out.println("Addition : "+sum);
    }
}
