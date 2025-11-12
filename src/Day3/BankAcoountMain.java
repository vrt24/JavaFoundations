package Day3;

public class BankAcoountMain {
    public static void main(String[] args){
        BankAcoount acc1=new BankAcoount("1445",10000);
        BankAcoount acc2=new BankAcoount("15556",9000);
        acc1.deposit(500);
        acc2.withdraw(1000);
        System.out.println(acc1.balance);
        System.out.println(acc2.balance);
    }
}
