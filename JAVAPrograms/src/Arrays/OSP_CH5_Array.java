package Arrays;

public class OSP_CH5_Array {
    public static void main(String[] args) {
        System.out.println("Array is a collection of similar Datatype ");

        // Creating a Array
         int [] marks = new int[5]; // 20 bytes allocated

//        int [] marks;
//        marks =new int[6];
        int [] mark = {10,30,20,40};

        marks[0] = 100;
        marks[1] = 167;
        marks[2] = 43;
        marks[3] = 10;
//        marks[5] = 10;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
}
