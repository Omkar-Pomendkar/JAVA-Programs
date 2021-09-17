package interface_Pac;

interface Bicycle
{
    int a = 45;
    void applyBrake(int increment);
    void speedUp(int decrement);
}
interface NewBicycle
{
    void blownewhorn();

}
class AvonCycle implements Bicycle,NewBicycle
{
    public void blownewhorn()
    {
        System.out.println("MAI hoo naa");
    }
    void blowHorn()
    {
        System.out.println(" PEE PEE PO PO");
    }

    public void speedUp(int decrement)
    {
        System.out.println("Speeding Up");
    }
    public void applyBrake(int increment)
    {
        System.out.println("Applying break");
    }
}
public class interface_1 {
    public static void main(String[] args) {
        System.out.println("Interface in Java");
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(10);
       // ac.a = 23;
        System.out.println(ac.a);
        ac.blownewhorn();
        ac.blowHorn();
    }
}
