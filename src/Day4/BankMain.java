package Day4;

public class BankMain {
    public static void main(String[] args){
        EncapsulatedBankAccount acc1=new EncapsulatedBankAccount("1554",14455);
        EncapsulatedBankAccount acc2=new EncapsulatedBankAccount("1445",0);
        acc1.deposit(500);
        acc1.deposit(-200);
        acc1.withdraw(2000);
        acc1.withdraw(20000);
        acc1.withdraw(-50);
        System.out.println(acc1.getBalance());

    }
}
