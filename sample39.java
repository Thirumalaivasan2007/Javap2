class Mythread extends Thread{
    public void run()
    {
        System.out.print("Thread is running");
    }
}
public class sample39 {
    public static void main(String[] args) {
        Mythread thread=new Mythread();
        thread.run();
    }
    
}
