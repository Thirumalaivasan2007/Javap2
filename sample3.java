import java.util.ArrayList;
public class sample3 {
    public static void main(String [] args){
        ArrayList <Integer> marks=new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);

        marks.set(1,50);
        marks.add(1,40);
        System.out.print(marks);
    }
}