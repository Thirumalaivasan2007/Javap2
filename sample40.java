class Mythread extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class Secondthread extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
public class sample40 {
    public static void main(String[] args) {
        Mythread thread=new Mythread();
        Mythread thread2=new Mythread();
        thread.start();
        thread2.start();
    }
}