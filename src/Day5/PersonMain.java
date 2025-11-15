package Day5;

public class PersonMain {
    public static void main(String[] args) {
        Studenta s = new Studenta("Vamsi", 23, 13);
        Teacher t = new Teacher("Rohit", 24, "CSI");
        s.displayStudent();
        t.displayTeacher();
    }
}
