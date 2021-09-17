package Arrays_Program;
import java.util.Arrays;
public class Array_Parsing_Function {
    public static void main(String[] args) {
        System.out.println("Array Parsing in the Function");
        int [] arr = {10,20,30,40,50,};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] arr)
    {
        arr[3] = 90;
    }
}
