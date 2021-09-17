package Arrays_Program;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Array_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
         //Taking input using For loop

        for (int row = 0; row < arr.length ; row++) {
            arr[row] = sc.nextInt();
            
        }
      //  System.out.println(Arrays.toString(arr));
        //Printing using For Loop
        for (int i : arr) {
            System.out.println(i + " ");

        }
    }
}
