package String;

import java.sql.SQLOutput;
import java.util.Locale;

public class osp_01_Count_Character_in_String {
    public static void main(String[] args) {
        System.out.println("Count Character in String");
        String name = "Godzilla";
        String name1 = "God";
        System.out.println((name+name1).length())   ;
        System.out.println((name+name1).toUpperCase())   ;
        System.out.println((name+name1).toLowerCase())   ;
        System.out.println(name1.replace("God","dad"))   ;
        System.out.println(name1)   ;


    }
}
