import java.util.HashMap;
import java.util.Scanner;
public class sample16 {
    public static void main(String[] args) {
        HashMap <Integer,Integer> num=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            if(num.containsKey(val))
            {
                num.put(val,num.get(val)+1);
            }
            else{
                num.put(val,1);
            }

            
        }
        System.out.println(num);
        sc.close();
        
    }
}
    

