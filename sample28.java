import java.io.*;
public class sample28 {
    public static void main(String[] args) {
        File file=new File("Student.txt");
        System.out.println(file.exists());
        try{
            file.createNewFile();
        }
        catch(Exception e){
            System.out.print(e.getMessage());

        }
        try(
        FileWriter writer=new FileWriter("Student.txt")){
        writer.write("Selva2\n");
        writer.write("Rama\n");
        writer.write("Vikash\n");
        System.out.println("Written Sucessfully");

        }
        catch(Exception e){
            System.out.print(e.getMessage());

        }
        System.out.println(file.length());
    }
}