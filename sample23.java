import java.util.*;
public class sample23 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Start");
        try{
            System.out.println("Entered try block");
            int a=sc.nextInt();                       
            System.out.println(a);
            System.out.println("Completed try block");

        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program Completed");
        sc.close();
    }
}
