package Day6;

import java.util.TreeSet;

public class StudentTree {
    public static void main(String[] args){
        TreeSet<String> students = new TreeSet<>();
        students.add("Vamsi");
        students.add("Arun");
        students.add("Rahul");
        students.add("Zoya");
        students.add("Bhanu");
        for (String i:students){
            System.out.println(i);
        }
    }

}
