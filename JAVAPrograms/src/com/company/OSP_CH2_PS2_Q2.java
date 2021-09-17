public class OSP_CH2_PS2_Q2 {
    public static void main(String[] args) {
        System.out.println("Encrypt & Decrypt");

        char grade = 'B';
        grade = (char)(grade + 8) ;
        System.out.println(grade);
        
        // Decrypted
        grade = (char)(grade - 8) ;
        System.out.println(grade);
    }
}
