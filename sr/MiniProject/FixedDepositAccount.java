package MiniProject;

public class FixedDepositAccount extends MyMoney {
    public FixedDepositAccount() {
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ฝากเงิน : " + amount);
        double tempBalance = getBalance() + amount;
        System.out.println(tempBalance);
        if (tempBalance >= 500) {
            setBalance(tempBalance);
        } else {
            System.out.println("ไม่สามารถฝากเงินได้");
        }
    }
}
