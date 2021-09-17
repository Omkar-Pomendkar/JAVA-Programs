import java.util.Locale;

public class OSP_CH3_PS3_Q1 {
    public static void main(String[] args) {
        System.out.println("String Method Excercise");
        //Convert String to lowercase

        String name = "HELLO WELCOME TO LEARN !@#$%^&*";
        name = name.toLowerCase();
        System.out.println(name);


        //Problem2
        //WAP TO REPLACE SPACE WITH UNDERSCORE
        String text = "To lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3
        String letter = "Dear <|Name|> Thanks alot ";
        letter = letter.replace("<|Name|>", "Omkar");
        System.out.println(letter);

        //problrm 4
        // to detect double and triple spaces in string
        String sentence= "A very good Morning to Everybody ";
        System.out.println(sentence.indexOf("  "));
        System.out.println(sentence.indexOf("   "));
//        System.out.println("   ");

        //Problem 5 use Escape Sequence

        String let = "Dear,\n \t Harry this Java Course\n`````````````````````````````````````````````````````````````````````` \t is Nice";
        System.out.println(let);
    }
}
