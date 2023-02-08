package chap5;

public class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ฝากเงิน : " + amount);
        double tempBalance = getBalance() + amount;
        if (tempBalance <= 500) {
            setBalance(tempBalance);
        } else {
            System.out.println("ไม่สามารถฝากเงินได้");
        }
    }
}
