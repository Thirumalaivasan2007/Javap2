import java.io.*;
public class sample27 {
    public static void main(String[] args) {
        File file=new File("Student.txt");
        System.out.println(file.exists());
        try{
            file.createNewFile();
        }
        catch(Exception e){
            System.out.print(e.getMessage());

        }
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());

    }
}
