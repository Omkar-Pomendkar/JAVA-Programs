package OOP;

class Rectangle1{
    int lengths;
    int breadths;
    public Rectangle1() {
        this.lengths = 4;
        this.breadths = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.lengths = length;
        this.breadths = breadth;
    }

    public int getLength() {
        return lengths;
    }

    public void setLength(int length) {
        this.lengths = length;
    }

    public int getBreadth() {
        return breadths;
    }

    public void setBreadth(int breadth) {
        this.breadths = breadth;
    }


}

public class Rect {
    public static void main(String[] args) {
        System.out.println("Overload Constructor");
        Rectangle1 r = new Rectangle1(10,20);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
