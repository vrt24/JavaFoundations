package Day3;

public class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+" | Id: "+id+" | CGPA: "+cgpa);
    }
}
