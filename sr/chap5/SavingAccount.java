package chap5;

import MiniProject.MyMoney;

public class SavingAccount extends MyMoney {


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
