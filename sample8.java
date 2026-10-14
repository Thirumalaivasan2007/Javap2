import java.util.Scanner;
import java.util.LinkedList;
public class sample8 {
    public static void main(String [] args)
    {
        LinkedList <Integer> marks=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.addFirst(5);
        marks.add(1,15);
        System.out.println(marks.getFirst());
        System.out.println(marks.getLast());
        System.out.println(marks.get(1));
        marks.removeFirst();
        marks.removeLast();
        marks.remove(1);
        System.out.print(marks);
        marks.add(10);
        marks.add(20);
        marks.add(30);
        System.out.println(marks.contains(20));
        System.out.println(marks.indexOf(30));
        
        sc.close();


    }
    
}
