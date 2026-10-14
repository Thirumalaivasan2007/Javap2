import java.util.*;
public class sample26{
    static void age(int age)throws IllegalArgumentException {
        try{
            if(age>100)
            {
                throw new IllegalArgumentException("Age above 100");
            }
            else if(age<0){
                throw new IllegalArgumentException("Negative Age");
            }
            else
            {
                System.out.print(age);
            }
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Age=sc.nextInt();
        age(Age);
        sc.close();
    }
}