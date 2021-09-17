package OOP;

 class Emp {
    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;

    }
}
public class Employe {
    public static void main(String[] args) {
        System.out.println("Creating new Class");
        Emp omkar = new Emp();
        omkar.setName("omkarpomendkar");
        omkar.Salary = 100000;
        System.out.println(omkar.getName());
        System.out.println(omkar.getSalary());
    }
}

