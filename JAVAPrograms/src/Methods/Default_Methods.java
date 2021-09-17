package Methods;
interface MyCamera{
    void takesnap();
    void takeVideo();

}
interface MyWifi
{
    String[] getNetworks();
    void ConnetToNetwork(String Network);
}
class MyCellPhone
{
    void CallNumber(int phonenumber)
    {
        System.out.println("Calling "+phonenumber);
    }
    void pickCall()
    {
        System.out.println("Calling ....");
    }

}
/*class MySmartphone extends MyCellPhone implements MyCamera,MyWifi
{
    public void takesnap()
    {
        System.out.println("Taking Snap");
    }
    void ConnetToNetwork(String Network)
    {

    }

}
public class Default_Methods {
    public static void main(String[] args) {
        System.out.println("Default Methods");
    }
}

*/