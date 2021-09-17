package inheritance;
class Circle1{
    public int radius;
    Circle1()
    {
        System.out.println("I am non-paramaterized Constructor");
    }
    Circle1(int r)
    {
        System.out.println("I am Circle Paramaterized Constructor");
        this.radius = r;
    }
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }



}
class Cylinder extends Circle1
{
    int height;
    Cylinder(int r,int h)
    {   super(r);
        System.out.println("I am Cylinder  Paramaterized Constructor");

        this.height=h;
    }

    public double Volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }



}
public class chp_10_ps_1 {
    public static void main(String[] args) {
        System.out.println();
        Cylinder obj = new Cylinder(12,4);
        System.out.println(obj.Volume());
        System.out.println(obj.area());

        //Circle obj1 = new Circle();
    }
}
