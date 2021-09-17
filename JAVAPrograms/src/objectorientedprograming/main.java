package objectorientedprograming;
class Cylinder{
    int radius;
    int height;

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
}

public class main {
    public static void main(String[] args) {
        System.out.println("Cylinder ");
        Cylinder c1 = new Cylinder();
        c1.height = 5;
        c1.radius = 4;
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}
