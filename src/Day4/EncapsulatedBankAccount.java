package Day4;

import java.util.Scanner;

public class EncapsulatedBankAccount {
    private String accountNumber;
    private double balance;
    EncapsulatedBankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double payment) {
        if(payment<=0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }
        this.balance+=payment;
            System.out.println("Deposit Successful! Account balance is "+getBalance());
    }
    public void withdraw(double payment){
        if(payment<=0){
            System.out.println("Invalid Withdraw Amount");
        }
        else if(payment>balance){ System.out.println("Insufficient Balance");}
        else{
            this.balance-=payment;
            System.out.println("Withdraw Successful! Account balance is "+getBalance());
        }
    }
}
