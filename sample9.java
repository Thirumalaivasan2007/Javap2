import java.util.Scanner;
import java.util.LinkedList;
public class sample9 {
    public static void main(String [] args)
    {
        LinkedList <Integer> num=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        int lar=num.getFirst();
        for(int i=0;i<n;i++)
        {
            if(num.get(i)>lar)
            {
                lar=num.get(i);
            }
        }
        System.out.print(lar);
        sc.close();
    }
    
}
