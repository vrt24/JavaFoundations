package Day3;

public class BankAcoount {
    String AcNo;
    double balance;
    public BankAcoount(String AcNo, double balance){
        this.AcNo=AcNo;
        this.balance=balance;
    }
    public double deposit(double amount){
        balance+=amount;
        return balance;
    }
    public double withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
        }
        return balance;
    }
}
