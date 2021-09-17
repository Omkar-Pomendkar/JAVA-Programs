package Practice;
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
        System.out.println("Searching in a String");
        String name = "OmkarPomendkar";
        char target = 's';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target)
    {
        if(str.length() == 0)
        {
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(target == str.charAt(i))
            {
                return true;
            }
            
        }
        return false;
    }
}
