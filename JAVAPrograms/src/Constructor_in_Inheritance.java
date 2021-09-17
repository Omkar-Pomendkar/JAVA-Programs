class Base{
    int x;
    Base()
    {
            System.out.println("I am a Constructor");
        }
    Base(int a)
    {
        System.out.println("I am a Overloaded Constructor with Value a" + a);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base
{
    Derived()
    {   super(0);
        System.out.println("I am a Derived Class Constructor");
    }
    Derived(int a ,int b)
    {   super(a);
        System.out.println("I am a Overloaded Constructor with Value a & b" + a +b);
    }



}

public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        System.out.println("Constructor_in_Inheritance");
        //Base b = new Base();
        Derived d = new Derived(4,9);
    }
}
