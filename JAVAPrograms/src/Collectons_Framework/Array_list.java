package Collectons_Framework;
import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        System.out.println("ArrayList Collection Framework JAVA");
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        l1.add(3,4);

        for (int i = 0 ;i< l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
