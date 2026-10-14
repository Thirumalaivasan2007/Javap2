import java.util.*;
public class sample38 {
    public static void main(String[] args) {
        List <Integer> marks=Arrays.asList(1,2,1,3,2);
        int total=(int)marks.stream().distinct().count();
        System.out.print(total);
    }
}
