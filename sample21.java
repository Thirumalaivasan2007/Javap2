import java.util.*;
public class sample21 {
    public static void main(String[] args) {
        ArrayList <Integer> num=new ArrayList<>();
        num.add(10);
        num.add(23);
        num.add(30);
        Iterator <Integer> it=num.iterator();
        while(it.hasNext())
        {
            int val=it.next();
            if(val%2==0)
            {
                it.remove();
            }
        }
        System.out.print(num);
    }
}
