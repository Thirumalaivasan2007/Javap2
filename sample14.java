import java.util.HashMap;
public class sample14 {
    public static void main(String [] args)
    {
        HashMap <Integer,String> students=new HashMap<>();
        students.put(101,"Selva");
        students.put(102,"Ram");
        students.put(103,"Vikash");
        System.out.println(students);
        System.out.println(students.get(102));
        students.put(102,"Sujeeth");
        System.out.println(students.get(102));
        students.remove(103);
        System.out.println(students.containsKey(102));
        System.out.println(students.containsValue("Selva"));
        System.out.println(students.size());
        System.out.println(students.get(105));
        System.out.print(students.getOrDefault(105,"Not found"));



    }
    
}
