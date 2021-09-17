package inheritance;
class Base
{
    int x ;
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void print(){
        System.out.println("Hello this is printing me");
    }
}
class Derived extends  Base
{
int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
public class Circle {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());

    }

}
