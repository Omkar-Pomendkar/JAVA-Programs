package Arrays;

public class osp_min_element_Array {
    public static void main(String[] args) {
        System.out.println("The smallest element in an Array");
        int min = Integer.MAX_VALUE;
        int []minarr = {10,23,5,456,89,54,78,99};
        for(int el:minarr)
        {
            if(el<min)
            {
                min = el;
            }
            System.out.println("the smallest number in an array is"+el);


        }
    }
}
