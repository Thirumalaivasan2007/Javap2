import java.util.*;
import java.io.*;
public class sample30 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        File file=new File("Names.txt");
        try{
            file.createNewFile();
        }
        catch(Exception e){
            System.out.print(e.getMessage());

        }
        try(FileWriter writer=new FileWriter("Names.txt",true)){
            for(int i=0;i<5;i++)
            {
                writer.write(sc.nextLine()+"\n");
                
            }
            System.out.println("Written Sucessfully");
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        sc.close();
    }
}