package chap5;

public class MyAccount {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount(644295034, "solahudeen", 5000);
        bk.printDetails();
        bk.deposit(1000);
        bk.printDetails();
        bk.withdraw(500);
        bk.printDetails();
        FixedDepositAccount fx = new FixedDepositAccount(644295034, "solahudeen", 100);
        fx.printDetails();
        fx.deposit(1000);
        fx.printDetails();
        fx.withdraw(1110);
        fx.printDetails();
        SavingAccount sv = new SavingAccount(34, "Solahudeen", 1000);
        fx.printDetails();
        sv.withdraw(100);
        fx.printDetails();

        sv.deposit(990);
        sv.printDetails();
    }
}
