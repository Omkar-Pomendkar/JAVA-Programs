package programs;
    class Base{
        Base(){
            System.out.println("I am Base Class Constructor");
        }
        Base(int a ){
            System.out.println("I am Base Class Constructor with a Value" +a );
        }
    }
    class Derived extends Base{

        Derived(){
//            super(10);
            //super(10 );
            System.out.println("I am a Derived Class Constructor");
        }
        Derived(int x ,int y){
            super(20);
            System.out.println("I am Base Class Constructor with a Value" +x +y );
        }
    }
    class Childofderived extends Derived{
        Childofderived(){
            System.out.println("I am a Constructor of Childof Derived Class");
        }
    }
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        System.out.println("Constuctor in Inheritance");
       // Base b = new Base();
        //Derived d = new Derived();

        Derived d = new Derived(10,20);
        Childofderived ad = new Childofderived();


    }
}
