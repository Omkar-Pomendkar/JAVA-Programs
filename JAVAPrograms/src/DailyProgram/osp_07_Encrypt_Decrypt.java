package DailyProgram;

public class osp_07_Encrypt_Decrypt {
    public static void main(String[] args) {
        System.out.println("Encrypt & Decrypt");
        char a = 'B';
        char b = (char)(a + 8);
        System.out.println("Encrypted : "+b);
        char c = (char)(b - 8);;
        System.out.println("Decrypted : "+c);
    }
}
