import java.util.*;
public class sample22 {
    public static void main(String[] args) {
        ArrayList <Integer> num =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        int target=sc.nextInt();
        Iterator <Integer> it=num.iterator(); 
        while(it.hasNext())
        {
            int val=it.next();
            if(val==target)
            {
                it.remove();
            }
        }
        System.out.print(num);
        sc.close();
    }
    
}
