package OOP;


class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        double Area;
        return Area = (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
//        return Area;
    }
//    public int getRadius(){
//        return radius;
//    }
//    public void setRadius(int radius){
//        this.radius = radius;
//    }
//    public int getheight(){
//        return height;
//    }
//    public void setheight(int height){
//        this.height = height;
//    }
}
public class gs {
    public static void main(String[] args) {
        System.out.println("Getter & Setter");
        Cylinder c = new Cylinder(10,20);

      //  c.setRadius(45);
        int r = c.getRadius();
        System.out.println(r);

        //c.setHeight(34);
        int h = c.getHeight();
        System.out.println(h);

        double t = c.SurfaceArea();
        System.out.println(t);
    }
}
