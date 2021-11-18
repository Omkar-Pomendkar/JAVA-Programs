package objectorientedprograming;

class Employee{
    int empid;
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Class");
        Employee e1 = new Employee();
        e1.empid= 45;
        System.out.println(e1.empid);
        CustomClass cs = new CustomClass();
//        cs.empid = 90;
    }
}
