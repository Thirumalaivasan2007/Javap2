import java.util.*;
public class sample19 {
    public static void main(String[] args) {
        TreeMap <Integer,String>  students=new TreeMap<>();
        students.put(101,"Selva");
        students.put(102,"Ram");
        students.put(103,"Vikash");
        students.put(102,"Sujeeth");
        System.out.println(students.firstKey());
        System.out.println(students.lastKey());
        System.out.println(students.lowerKey(105));
        System.out.println(students.higherKey(105));
        System.out.println(students.descendingMap());
    }
    
}
