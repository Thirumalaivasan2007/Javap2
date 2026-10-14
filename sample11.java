import java.util.Scanner;
import java.util.LinkedList;
public class sample11 {
    public static void main(String [] args)
    {
        LinkedList <Integer> num=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        boolean palindrome=true;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            if(num.get(left)!=(num.get(right)))
                {
                    palindrome=false;
                    break;
                }
            left++;
            right--;
            
        }
        System.out.print((palindrome)?"Palindrome":"Not Palindrome");
        sc.close();
    }
}
