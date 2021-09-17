import javax.sound.midi.Soundbank;

class Phone{
    public void greet()
    {
        System.out.println("Hello Everybody");
    }
    public void on()
    {
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void Music()
    {
        System.out.println("Running Music");
    }
    public void on()
    {
        System.out.println("Turning on SmartPhone");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic Method dispatch");
        Phone p = new Phone();
        SmartPhone sp = new SmartPhone();

        Phone obj = new SmartPhone();
        obj.on();
    }
}
