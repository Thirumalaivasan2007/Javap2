interface Employee{
    void calculateSalary();
    void Display();
}
class fullTime implements Employee
{
    String name;
    int salary;
    fullTime(String name)
    {
        this.name=name;
    }
    public void calculateSalary(){
        salary=30000;
    }
    public void Display(){
        System.out.println(name+" = "+salary);
    }
    
}
class partTime implements Employee
{
    String name;
    double salary;
    double hourRate;
    double hours;
    partTime(String name,double hourRate,double hours)
    {
        this.name=name;
        this.hourRate=hourRate;
        this.hours=hours;
    }
    public void calculateSalary(){
        salary=hours*hourRate;

    }
    public void Display(){
        System.out.println(name+" = "+salary);
    }
    
}



public class sample35 {
    public static void main(String[] args) {
        fullTime ft=new fullTime("Arun");
        partTime pt=new partTime("Rama",10,1000);
        ft.calculateSalary();
        pt.calculateSalary();
        ft.Display();
        pt.Display();
    }
}
