package Arrays;

import java.sql.SQLOutput;

public class osp_for_each_loop {
    public static void main(String[] args) {
        System.out.println("For Each loop in JAVA");
        int[] marks = {10, 20, 30, 40, 40, 60};
        float[] marks1 = {28.9f, 45.7f, 78.6f};

        System.out.println(marks.length);  // Printing using Naive Method
        System.out.println(marks1.length);

        for(int i = 0; i< marks.length;i++)  //Printing using For Loop
        {
            System.out.println(marks[i]);
        }


        // Reverse Order
        for(int i = marks.length-1;i>0;i--)
            System.out.println(marks[i]);

        // Printing using for each loop
        for (int el:marks)
            System.out.println(el);
    }
}
