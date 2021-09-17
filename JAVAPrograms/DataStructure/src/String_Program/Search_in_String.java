package String_Program;
/*LOGIC
 Problem Statement
 Finding a Character from a string
 Solution
 1) Take a String
 2) Define Char which u want to find in main
 3) Create Function which returns Boolean as we  want to se Its True or False
 4) Use .charAt(Function)
*/
public class Search_in_String {
    public static void main(String[] args) {
        System.out.println("Searching Character in a String");
        String name = "omkar";
        char target = 'a';
        System.out.println(search(name,target));

    }
    static boolean search(String name , char target)
    {
        if(name.length() == 0)
        {
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
            if(target == name.charAt(i))
            {
                return true;
            }

        }
        return false;

    }
}
