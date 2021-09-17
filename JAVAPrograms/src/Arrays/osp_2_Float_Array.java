package Arrays;

import org.w3c.dom.ls.LSOutput;

public class osp_2_Float_Array {
    public static void main(String[] args) {
        System.out.println("Float Array");
        float [] farr = new float[3];
        farr[0] = 1.2f;
        farr[1] = 1.4f;
        farr[2] = 1.3f;
        System.out.println(farr[0]);
        System.out.println(farr[1]);
        System.out.println(farr[2]);

    for(float element:farr)
    {
        System.out.println(element);
    }
}
}
