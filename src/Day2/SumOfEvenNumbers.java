package Day2;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int sum=0, i=2;
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println("The sum of Even numbers from 1 to "+ n +" is: "+ sum);
        sc.close();
    }
}
