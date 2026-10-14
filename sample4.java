import java.util.ArrayList;
public class sample4 {
    public static void main(String [] args){
        ArrayList <Integer> marks=new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);

        for(int i=0;i<marks.size();i++)
        {
            System.out.print(marks.get(i));
        }
       
    }
} 
