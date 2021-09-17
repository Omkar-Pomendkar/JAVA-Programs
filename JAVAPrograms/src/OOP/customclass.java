package OOP;


class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is"+id);
        System.out.println(" & My Name  is"+name);
    }
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("HEllo");
        Employee e1 = new Employee();// Instantiating a new Object
        Employee e2 = new Employee();// Instantiating a new Object
        e1.id = 10;// Setting Properties
        e1.name = "omkar";
        e2.id = 67;
        //System.out.println(e1.id);
        //System.out.println(e1.name);
        e1.printDetails();
        e2.printDetails();
    }
}
