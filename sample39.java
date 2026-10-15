class Mythread extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class sample39 {
    public static void main(String[] args) {
        Mythread thread=new Mythread();
        System.out.println("Hi...");
        thread.start();
        System.out.println("bye....");
    }
    
}
