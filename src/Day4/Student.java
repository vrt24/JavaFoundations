package Day4;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    public Student(String name, int id, double cgpa){
        this.name=name;
        this.id=id;
        setCgpa(cgpa);
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getCgpa(){
        return cgpa;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCgpa(double cgpa){
        if(cgpa<0 || cgpa>4.0){
            System.out.println("Invalid CGPA");
        }
        else{
            this.cgpa=cgpa;
        }
    }
    public void printInfo(){
        System.out.println("Name: "+name+" | Id: "+id+" | CGPA: "+cgpa);
    }
}
