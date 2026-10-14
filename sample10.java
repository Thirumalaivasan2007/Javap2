import java.util.Scanner;
import java.util.LinkedList;
public class sample10 {
    public static void main(String [] args)
    {
        LinkedList <Integer> num=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        LinkedList <Integer> rev=new LinkedList<>();
        for(int i:num)
        {
            rev.addFirst(i);
        }
        System.out.print(rev);
        sc.close();
    }
    
}
