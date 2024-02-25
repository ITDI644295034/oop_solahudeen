package MiniProject;

public class SavingAccount extends MyMoney {
    @Override
    public void withdraw(double amount) {
        System.out.println("ถอนเงิน : " + amount);
        System.out.println(getBalance());
        double tempBalance = amount - getBalance();
        System.out.println(tempBalance);
        if (tempBalance >= 50) {
            setBalance(tempBalance);
        } else {
            System.out.println("ไม่สามารถถอนได้");
        }
    }
}
