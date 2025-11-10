package Day1;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double a=sc.nextDouble();
        System.out.println("Enter 2nd number:");
        double b=sc.nextDouble();
        System.out.println("Enter any operation to perform (+, -, *, /):");
        char op=sc.next().charAt(0);

        switch (op){
            case '+' : System.out.println("The sum of a and b is: "+(a+b));break;
            case '-' : System.out.println("The difference of a and b is:"+(a-b));break;
            case '*' : System.out.println("The product of a and b is:"+(a*b));break;
            case '/' :
                if(b!=0)
                    System.out.println("The division of a and b is:"+(a/b));
                else
                    System.out.println("Division by zero is not possible"); break;
            default: System.out.println("Enter a valid operator");
        }
        sc.close();
    }
}
