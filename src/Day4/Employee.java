package Day4;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        if(salary<0){
            System.out.println("Invalid Salary");
            this.salary=0;
        }
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary < salary) {
            System.out.println("Salary cannot be decreased");
            return;
        }
        this.salary = newSalary;
    }
    public void giveRaise(double percent){
        if(percent<=0){
            System.out.println("Invalid raise percent");
            return;
        }
        else salary=salary+(salary*percent/100);
    }
}
