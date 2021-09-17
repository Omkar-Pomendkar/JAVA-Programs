package inheritance;
class Base1{
    int x;
    Base1()
    {
        System.out.println("I am a Constructor");
    }
    Base1(int a)
    {
        System.out.println("I am a Overloaded Constructor with Value of A"+a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1
{
    int y;
    Derived1()
    {
        //super(10);
        System.out.println("I am a Derived Class Constructor");
    }
    Derived1(int a,int b)
    {   super(a);
        System.out.println("I am a Overloaded Constructor with value of A & B"+b);
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildofDerived extends Derived1
{
    ChildofDerived()
    {
        System.out.println("I am a Child of Derived Constructor");
    }
    ChildofDerived(int a ,int b, int c)
    {  super(a,b);
        System.out.println("I am a Overloaded Child of Derived Constructor"+c);
    }

}
public class Constructors_in_inheritance {
    public static void main(String[] args) {
  //  Base1 b = new Base1();
    //Derived1 d = new Derived1();
    //Derived1 d = new Derived1(10,20);
    ChildofDerived cd = new ChildofDerived(10,20,30);
    }
}
