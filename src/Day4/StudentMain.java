package Day4;

public class StudentMain {
    public static void main() {
        Student s1 = new Student("Vamsi", 13, 3.4);
        Student s2 = new Student("Rohit", 14, 3.5);
        Student s3 = new Student("Tummalapalli", 15, 3.6);
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s1.setCgpa(3.5);
        s1.printInfo();
        s2.setCgpa(5.0);
        s2.printInfo();
    }
}
