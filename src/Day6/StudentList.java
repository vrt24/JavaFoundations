package Day6;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<String>();
        students.add("Vamsi");
        students.add("Rohit");
        students.add("Tummalapalli");
        students.remove(1);
        System.out.println(students.contains("Vamsi"));
        for (String i:students){
            System.out.println(i);
        }
    }
}
