import java.util.ArrayList;
public class sample2 {
    public static void main(String [] args){
        ArrayList <Integer> marks=new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(900);
        marks.add(40);
        System.out.println(marks);
        marks.set(1,88);
        System.out.println(marks);
        marks.remove(0);
        System.out.println(marks);
        System.out.println(marks.get(1));
        System.out.println(marks.size());
        System.out.println(marks.contains(90));
        System.out.println(marks.isEmpty());
        marks.clear();
        System.out.println(marks.isEmpty());


    }
    
}
