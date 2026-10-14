import java.util.Scanner;
import java.util.ArrayList;
public class sample5 {
    public static void main(String [] args)
    {
        ArrayList <Integer> num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        System.out.println(num);
        for(int i=0;i<num.size();i++)
        {
            if(num.get(i)%2==0)
            {
                num.remove(i);
                i--;
            }
        }
        System.out.print(num);
        sc.close();
    }
    
}
