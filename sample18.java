import java.util.HashMap;
import java.util.Scanner;
public class sample18 {
    public static void main(String[] args) {
        HashMap <Integer,Integer> num=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr []=new int[n];
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int temp=t-arr[i];
            if(num.containsKey(temp))
            {
                System.out.print(num.get(temp)+" and "+i);
                sc.close();
                return;
            }
            num.put(arr[i],i);
        }
        System.out.print("No Pairs Found");
        sc.close();
    }
}