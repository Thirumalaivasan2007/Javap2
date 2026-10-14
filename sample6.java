import java.util.Scanner;
import java.util.ArrayList;
public class sample6 {
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
        for(int i=0;i<n;i++)
        {
            if(num.get(i)>0)
            {
                
                num.set(i,0);
            }
        }
        System.out.print(num);
        sc.close();
    }
    
}
