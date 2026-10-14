import java.util.*;
public class sample20 {
    public static void main(String[] args) {
        HashMap <Character,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char temp=str.charAt(i);
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                System.out.print(str.charAt(i));
                sc.close();
                return ;
            }
        }
        sc.close();
    }
}
