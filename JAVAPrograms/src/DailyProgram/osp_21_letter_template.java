package DailyProgram;

public class osp_21_letter_template {
    public static void main(String[] args) {
        System.out.println("Letter Template");
        String letter = "Dear <|name|>, Thanks a lot ";
        letter = letter.replace("<|name|>","omkar");
        System.out.println(letter);
    }
}
