package Day5;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
class Studenta extends Person{
    int rollno;
    Studenta(String name, int age, int rollno){
        super(name, age);
        this.rollno=rollno;
    }
    public void displayStudent() {
        super.displayInfo();
        System.out.println("Roll No: " + rollno);
    }
}
class Teacher extends Person{
    public String subject;
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject=subject;
    }
    public void displayTeacher(){
        super.displayInfo();
        System.out.println("Subject: "+subject);
    }
}