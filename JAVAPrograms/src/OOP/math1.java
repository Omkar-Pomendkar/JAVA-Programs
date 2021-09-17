package OOP;

class Rectangle{
    int length,breadth;
    public int area(){
        return length*breadth;
    }
    public int Perimeter(){
        return 2*(length*breadth);
    }
}
public class math1 {
    public static void main(String[] args) {
        System.out.println(" Value of Rectangle is");
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 8;
        System.out.println("Area of Rectangle is "+r.area());
        System.out.println("Perimeter of Rectangle is "+r.Perimeter());
    }
}
