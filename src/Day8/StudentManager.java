package Day8;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students=new ArrayList<>();
    public void addStudent(Student s){
        students.add(s);
    }

    public Student searchStudent(int id){
        for (Student s:students){
            if (s.getId()==id){
                return s;
            }
        }
        return null;
    }

    public void removeStudent(int id){
        Student found=searchStudent(id);
        if(found!=null){
            students.remove(found);
            System.out.println("Student with ID: "+id+" Removed");
        }
    }
    public void updateGpa(int id,double newGpa){
        Student search=searchStudent(id);
        if(search!=null){
            search.setGpa(newGpa);
            System.out.println("Student with ID: "+id+"'s GPA is updated to: "+newGpa);
        }

    }
    public void displayAllStudents(){
        for (Student i:students){
            System.out.println(i);
        }
    }
}
