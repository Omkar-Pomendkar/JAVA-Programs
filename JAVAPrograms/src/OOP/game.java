package OOP;

class TommyVecetti{
    public void hitting(){
        System.out.println("Hitting");
    }
    public void runing(){

    }
    public void firing(){

    }
}
public class game {
    public static void main(String[] args) {
        System.out.println("Gaming");
        TommyVecetti tv = new TommyVecetti();
        tv.firing();
        tv.hitting();
        tv.runing();
    }
}
