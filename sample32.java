import java.util.Scanner;
public class sample32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int num:arr)
        {
            if(num<0)
            {
                num=0;
            }
            System.out.println(num);
        }
        
        sc.close();
    }
}