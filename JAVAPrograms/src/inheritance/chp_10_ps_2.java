package inheritance;
class Rectangle
{
    int length,width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    Rectangle(int width, int length)
    {
        this.width = width;
        this.length = length;
        System.out.println("Constructor with length & Breadth");
    }
    public int area()
    {
        int area;
        return area = this.length*this.width;
    }
}
class Cuboid extends Rectangle
{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int length, int width, int height)
    {   super(length,width);
        this.height=height;
        System.out.println("Paramaterized Constructor with Width");
    }
    public double AreaofCuboid()
    {
        double AreaofCuboid;
        //SA=2lw+2lh+2hw
        return AreaofCuboid = 2*this.length*this.width+2*this.length*this.height+2*this.height*this.width;
    }

}
public class chp_10_ps_2 {
    public static void main(String[] args) {
        System.out.println("Chapter 10 2");
        //Rectangle r = new Rectangle(10,20);
        Cuboid cd = new Cuboid(4,5,8);
       // System.out.println(r.area());
        System.out.println(cd.AreaofCuboid());
    }
}
