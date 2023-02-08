package chap5;

public class SavingAccount extends BankAccount {
    public SavingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("ถอนเงิน : " + amount);
        double tempBalance = getBalance() - amount;
        if (tempBalance >= 50) {
            setBalance(tempBalance);
        } else {
            System.out.println("ไม่สามารถถอนได้");
        }
    }
}
