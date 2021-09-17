import jdk.swing.interop.SwingInterOpUtils;

public class OSP_CH5_Array_Operation {
    public static void main(String[] args) {
        System.out.println("Diaplaying Array");
        int [] marks = {10,29,39,40,50};
        System.out.println(marks.length);
        for(int element:marks)
            System.out.println(element);
        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        for(int a = marks.length-1;a>=0;a--)
        {
            System.out.println(marks[a]);
        }
    }
}
