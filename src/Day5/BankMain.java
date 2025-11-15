package Day5;

public class BankMain {
    public static void main(String[] args){
        Bank b;
        b=new SBI();
        System.out.println(b.getInterestRate());
        b=new ICICI();
        System.out.println(b.getInterestRate());
        b=new HDFC();
        System.out.println(b.getInterestRate());
    }
}
