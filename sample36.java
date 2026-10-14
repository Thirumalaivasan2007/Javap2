@FunctionalInterface
interface calculator{
    int calculate(int a,int b);
}
public class sample36 {
    public static void main(String[] args) {
        calculator c=(a,b)-> {
            if(a<b) return a;
            else return b;
        };
        System.out.print(c.calculate(10, 20));

    }
    
}
