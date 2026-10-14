import java.util.*;
import java.io.*;
public class sample31 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        File file=new File("Names.txt");
        try{
            file.createNewFile();
        }
        catch(Exception e){
            System.out.print(e.getMessage());

        }
        try(BufferedReader reader=new BufferedReader(new FileReader("Names.txt"))){
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        sc.close();
    }
}