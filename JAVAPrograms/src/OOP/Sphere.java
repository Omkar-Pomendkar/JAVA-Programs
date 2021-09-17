package OOP;
class Spheres {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Volume(double radius)
    {
            double Volume ;
            return Volume = (4/3)*Math.PI*radius*radius*radius;
    }
}
        public class Sphere {
    public static void main(String[] args) {
        System.out.println("Sphere");
        Spheres sp = new Spheres();
        sp.setRadius(100);
        System.out.println(sp.getRadius());
        System.out.println(sp.Volume(10));
    }
}
