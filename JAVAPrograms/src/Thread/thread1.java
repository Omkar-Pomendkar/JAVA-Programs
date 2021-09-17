package Thread;
class Mythraed extends Thread
{
    @Override
    public void run() {
        while(true){
        System.out.println("My thread is Running ");
        System.out.println("I am Happy");
    }
    }
}
class Mythraed2 extends Thread
{
    @Override
    public void run() {
        while(true){
            System.out.println("My thread 2 is Running ");
            System.out.println("Thread 2 is good I am Sad");
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        Mythraed t1 = new Mythraed();
        Mythraed2 t2 = new Mythraed2();
        t1.start();
        t2.start();

    }
}
