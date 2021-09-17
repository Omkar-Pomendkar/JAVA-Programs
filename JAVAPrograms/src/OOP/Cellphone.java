package OOP;

class Cell{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void Vibrate(){
        System.out.println("Vibrating..........");
    }
}
public class Cellphone {
    public static void main(String[] args) {
        System.out.println("Cellphone");
        System.out.println();
        System.out.println();
        Cell c = new Cell();
        c.ring();
        c.Vibrate();
    }
}
