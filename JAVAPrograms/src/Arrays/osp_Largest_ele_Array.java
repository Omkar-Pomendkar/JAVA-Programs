package Arrays;

public class osp_Largest_ele_Array {
    public static void main(String[] args) {
        System.out.println("Finding Largest element of an Array");
        int []arr = {10,45,67,23,17,9,65,894};
        int max = Integer.MIN_VALUE;
        for (int element:arr) {
            //System.out.println(element);
            if(element>max)
            {
                max=element;
            }

        }
        System.out.println("The value of maximum element is "+max);
    }
}
