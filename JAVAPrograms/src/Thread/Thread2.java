package Thread;
class MyThreadRunnable1 implements Runnable
{
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am a Thread 1");
        }
    }

}
class MyThreadRunnable2 implements Runnable
{
    public void run(){
        int i = 0 ;
        while(i<4000)
        System.out.println("I am a Thread 2");
    };

}
public class Thread2 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
