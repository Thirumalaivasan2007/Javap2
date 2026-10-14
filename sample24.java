import java.util.*;
public class sample24{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Start");
        try{
            System.out.println(10.0/0.0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        finally{
            System.out.println("Program Completed");
        }                    
        sc.close();
    }
}
