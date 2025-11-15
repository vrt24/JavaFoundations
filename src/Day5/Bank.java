package Day5;

class Bank {
    double getInterestRate(){
        return 0.0;
    }
}
class SBI extends Bank{
    @Override
    double getInterestRate() {
        return 5.5;
    }
}
class ICICI extends Bank{
    @Override
    double getInterestRate() {
        return 6.0;
    }
}
class HDFC extends Bank{
    @Override
    double getInterestRate() {
        return 6.5;
    }
}