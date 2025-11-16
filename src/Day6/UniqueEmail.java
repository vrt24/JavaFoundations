package Day6;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmail {
    public static void main(String[] args){
        HashSet<String> emails=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 email addresses: ");
        for (int i=0;i<10;i++){
            String email=sc.nextLine();
            if (!emails.add(email)){
                System.out.println("Duplicate: " + email);
            }
        }
        for (String i:emails){
            System.out.println(i);
        }
        System.out.println("Unique emails count: " + emails.size());
    }
}
