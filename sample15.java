import java.util.HashMap;
public class sample15 {
    public static void main(String [] args)
    {
        HashMap <Integer,String> students=new HashMap<>();
        students.put(101,"Selva");
        students.put(102,"Ram");
        students.put(103,"Vikash");
        for(int key:students.keySet())
        {
            System.out.println(key);
        }
        for(String name:students.values())
        {
            System.out.println(name);
        }
        for(var entry:students.entrySet())
        {
            System.out.printf("%d=%s",entry.getKey(),entry.getValue());
            System.out.println();
        }
      
    }
    
}
