package objectorientedprograming;
class Emp
{
    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
public class Employe {
    public static void main(String[] args) {
        System.out.println("Creating Class with Employee");
        Emp e1 = new Emp();
        e1.Name = "omkar";
        e1.Salary = 3000;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
