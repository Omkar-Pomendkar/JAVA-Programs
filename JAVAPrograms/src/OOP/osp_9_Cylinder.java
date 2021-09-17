package OOP;

import java.rmi.MarshalException;

class Cylinder1{
   private int radius;
   private int height;

    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
//    public int getRadius()
//    {
//        return radius;
//    }
//    public int getHeight()
//    {
//        return height;
//    }
//    public void setRadius(int r)
//    {
//        radius = r;
//    }
//    public void setHeight(int h)
//    {
//        height = h;
//    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double area() {
        double Area;
        return  Area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * 2);
    }
}

//------------A=2πrh+2πr2------------
public class osp_9_Cylinder {
    public static void main(String[] args) {
        System.out.println("Problem set 9 First");
        Cylinder1 c1 = new Cylinder1(10,20);
       // Cylinder1 c2 = new Cylinder1();



       // c1.height = 10;
      //  c1.radius = 5;
      // c1.setHeight(500);
       // c1.setRadius(500);
        double r = c1.getRadius();
        double h = c1.getHeight();
        double v = c1.area();
        System.out.println(r);
        System.out.println(h);
        System.out.println(v);

//        c2.setHeight(200);
//        c2.setRadius(300);
//


//        System.out.println(c1.getHeight());
//        System.out.println(c1.getRadius());
//
//        System.out.println(c2.getHeight());
//        System.out.println(c2.getRadius());
        //System.out.println(c1.setHeight());
        //System.out.println(c1.setRadius());

    }
}
