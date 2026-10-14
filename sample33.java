interface Greeting{
    void sayHello();
    default void sayBye()
    {
        System.out.println("Bye");
    }
    static void Welcome()
    {
        System.out.println("Welcome");
    }

}
class C implements Greeting{
    public void sayHello()
    {
        System.out.println("Hello");
    }
    public void sayBye()
    {
        System.out.println("Bye...Bye");
    }
}

public class sample33 {
    public static void main(String[] args) {
        C greet=new C();
        greet.sayHello();
        greet.sayBye();
        Greeting.Welcome();
    }
}