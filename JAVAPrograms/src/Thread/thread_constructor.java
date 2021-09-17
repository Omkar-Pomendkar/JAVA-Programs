package Thread;
class MyThr extends Thread
{
    public MyThr(String Name) {
        super(Name);
    }
        public void run()
        {
            System.out.println("thankyou");
           /* while(true)
            {
                System.out.println("I am a Thread");
            }
*/
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("omkar");
        MyThr t2 = new MyThr("omkar Pomendkar");
        t.start();
        t2.start();
        System.out.println("Id of Thread is"+ t.getId());
        System.out.println("Id of Thread is"+ t.getName());
        System.out.println("Id of Thread is"+ t2.getId());
        System.out.println("Id of Thread is"+ t2.getName());

    }
}
