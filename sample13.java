import java.util.TreeSet;
public class sample13 {
    public static void main(String [] args)
    {
        TreeSet <Integer> marks=new TreeSet<>();
        marks.add(10 );
        marks.add(20);
        marks.add(10);
        marks.add(30);
        marks.add(20);
        System.out.println(marks);
        System.out.println(marks.contains(20));
        System.out.println(marks.size());
    }
}