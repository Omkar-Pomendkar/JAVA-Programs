

class A {
    public void method1()
    {
        System.out.println("I am Method 1 of Class A");
    }

    public void method2()
    {
        System.out.println("I am Method 2 of Class A");
    }
}
class B extends A
{   @Override
    public void method2()
    {
        System.out.println("I am Method 2 of Class B");
    }
    public void method3()
    {
        System.out.println("I am Method 3 of Class B");
    }
}


public class Method_Overriding {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        A a = new A();
        B b = new B();

        a.method2();
        b.method2();
    }
}
