import java.util.Scanner;
import java.util.ArrayList;
public class sample7 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> num=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        System.out.println(num);
        num.add(0,num.get(n-1));
        num.remove(n);
        System.out.print(num);
        sc.close();
    }
    
}
