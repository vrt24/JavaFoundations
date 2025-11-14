package Day4;

public class EmployeeMain {
    public static void main(String[] args){
        Employee e1=new Employee(14,"Vamsi",60000);
        e1.giveRaise(10);
        e1.setSalary(40000);
        e1.giveRaise(-5);
        e1.giveRaise(5);
        e1.setSalary(65000);
        e1.setSalary(50000);
        e1.giveRaise(-10);
        e1.giveRaise(20);
    }
}
