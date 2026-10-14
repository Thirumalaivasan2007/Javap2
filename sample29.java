import java.io.*;
public class sample29 {
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
        FileWriter writer=new FileWriter("Student.txt",true)){
        writer.write("Selva1\n");
        writer.write("Rama1\n");
        writer.write("Vikash1\n");
        System.out.println("Written Sucessfully");

        }
        catch(Exception e){
            System.out.print(e.getMessage());

        }
        System.out.println(file.length());

    }
}