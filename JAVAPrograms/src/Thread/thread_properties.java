package Thread;
class MyThread123 extends Thread
{
    public void run()
    {   while(true) {
        System.out.println("Good Morning");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }
}

class MyThread456 extends Thread {
    public void run() {
       // while(true)
        System.out.println("Welcome");
    }
}
public class thread_properties {
    public static void main(String[] args) {
        System.out.println("Thread Properties");
        MyThread123 mt2 = new MyThread123();
        MyThread456 mt1 = new MyThread456();
       // mt1.setPriority(6);
       // mt2.setPriority(9);
        System.out.println(mt2.getPriority());
        System.out.println(mt1.getPriority());
        mt1.start();
        System.out.println(mt1.getState());
        System.out.println(Thread.currentThread().getState());
        //mt2.start();

    }
}
