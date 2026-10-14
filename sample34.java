interface Shape{
    void area(double a);
}
class square implements Shape{
    public void area(double s)
    {
        System.out.println(s*s);
    }
}
class circle implements Shape{
    public void area(double r)
    {
        System.out.println(3.14*(r*r));
    }
}

public class sample34 {
    public static void main(String[] args) {
        square s=new square();
        circle c=new circle();
        s.area(5);
        c.area(7);
    
    
    }
    
}
