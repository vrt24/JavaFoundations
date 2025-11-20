package Day8;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args){
        StudentManager s=new StudentManager();
        Scanner sc=new Scanner(System.in);
        int flag=0;
        while(flag!=6){
            System.out.println("1.Add Student\n2.Remove Student\n3.Update Gpa\n4.Search Student\n5.Display All students\n6.Exit\nEnter your choice: ");
            flag=sc.nextInt();
            switch (flag){
                case 1:
                    System.out.println("Enter Id: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter Gpa: ");
                    double gpa=sc.nextDouble();
                    Student stu=new Student(id,name,gpa);
                    s.addStudent(stu);
                    break;
                case 2:
                    System.out.println("Enter the id of the student to remove: ");
                    int remove=sc.nextInt();
                    s.removeStudent(remove);
                    break;
                case 3:
                    System.out.println("Enter Id: ");
                    int id3=sc.nextInt();
                    System.out.println("Enter new GPA: ");
                    double newGpa=sc.nextDouble();
                    s.updateGpa(id3,newGpa);
                    break;
                case 4:
                    System.out.println("Enter Id to search: ");
                    int id4=sc.nextInt();
                    Student found= s.searchStudent(id4);
                    if(found!=null){
                        System.out.println(found);
                    }
                    else System.out.println("Not Found");
                    break;
                case 5:
                    s.displayAllStudents();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
