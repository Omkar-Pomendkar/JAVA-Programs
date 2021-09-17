package DailyProgram;
class Compare{
    Compare(int a) {

    }
    Compare(int a,int b){}

    void print(){

        System.out.println("x & y");
    }
}
public class osp_15_Compare_Object {
    public static void main(String[] args) {
        System.out.println("Comparing 2 Object");
        Compare c1 = new Compare(10);
        Compare c2 = new Compare(10,20);
        System.out.println(c1.equals(c2));
    }
}
