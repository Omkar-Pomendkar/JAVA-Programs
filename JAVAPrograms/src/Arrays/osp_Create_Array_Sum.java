package Arrays;

public class osp_Create_Array_Sum {
    public static void main(String[] args) {
        System.out.println("Create an Array & Calculate their SUM");
    //    float [] arr = new float[5];
        float []arr = {12.4f,5.6f,67.9f};
        float sum = 0;
        for(float element:arr)
            sum = element+sum;
            System.out.println(sum);

    }
}
