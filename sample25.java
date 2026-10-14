public class sample25{
    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println("Start");
        int age=16;
        try{
        if(age<18)
        {
            throw new IllegalArgumentException("Age must be above 18");
        }
        System.out.print("Eligible");
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}