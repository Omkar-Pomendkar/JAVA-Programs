package Abstract;

import java.sql.SQLOutput;

abstract class Telephone
{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnet();

}
class SmartPhone extends Telephone{
    public void ring()
    {
        System.out.println("Ringing");
    }
    public void lift()
    {
        System.out.println("Lifting");
    }
    public void disconnet()
    {
        System.out.println("Disconnecting");
    }
}

public class Abstract_2 {
    public static void main(String[] args) {
        System.out.println("Question no 4");
        //SmartPhone s = new Telephone();
    }
}
