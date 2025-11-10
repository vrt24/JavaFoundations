package Day1;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();
        System.out.println("The sum is : 3" + (num1+num2));
        sc.close();
    }
}
