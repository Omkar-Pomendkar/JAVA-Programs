package Abstract;
abstract class Pen
        {
            Pen()
            {
                System.out.println(" I am in Constructor of Pen");
            }
          public void write(){
              System.out.println("I am Writing");
          };
          public  void refill(){};
        }
        class child extends Pen
        {   @Override
            public  void write(){};
            public void refill(){};
        }
        class FountainPen extends Pen
        {
                public void ChangeNib()
                {
                    System.out.println("Changing Nib");
                }
        }
        class Monkey
        {
            public void jump(){};
            public void bite(){};

        }
        interface BasicAnimal {
            public void eat();
            public void sleep();
        }
        class Human extends Monkey implements BasicAnimal
        {
            public void speak()
            {
                System.out.println("Speaking");
            }
            @Override
            public void eat() {
                System.out.println("Eating");
            }

            @Override
            public void sleep() {
                System.out.println("Sleeping");
            }
        }
public class Abstract_1 {
    public static void main(String[] args) {
        System.out.println("Abstract Class");
       // Pen p = new Pen();
        child c = new child();
        FountainPen fp = new FountainPen();
        fp.ChangeNib();

        Human omkar = new Human();
        omkar.sleep();

        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        //cannot use speak method because refrence is mOnkey
    }
}
