package OOP;


class Square{
    int Side ;
    public void area(){
        System.out.println("Area of Square = "+ Side*Side);
    }
    public void perimeter(){
        System.out.println("Perimeter of Square = "+ 4*Side);
    }

}

public class maths {
    public static void main(String[] args) {
        System.out.println();
        Square sq = new Square();
        sq.Side = 10;
        sq.area();
        sq.perimeter();
    }
}
