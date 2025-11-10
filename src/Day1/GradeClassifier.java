package Day1;
import java.util.Scanner;
public class GradeClassifier {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marks (0-100) :");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("The Grade is A");
        } else if (marks>=80) {
            System.out.println("The Grade is B");
        } else if (marks>=70) {
            System.out.println("The Grade is C");
        }
        else
            System.out.println("The Grade is F");
        sc.close();
    }
}
