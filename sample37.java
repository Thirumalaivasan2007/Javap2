import java.util.*;
@FunctionalInterface
interface check{
    void Check(String str);
}
public class sample37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        check c=(str)->{
            int len=str.length();
            if(len>5) System.out.print("Yes, it contains more than 5 characters");
            else System.out.print("No, it contains more than 5 characters");
           
        };
        c.Check(sc.nextLine());
        sc.close();
    }
}