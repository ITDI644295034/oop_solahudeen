package MiniProject;

public class MyMoney {
    int accountNumber,openAcc;
    String name, surname, accountType;
    double deposit, withdraw, balance;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("ฝากเงิน : " + amount);
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        System.out.println("ถอนเงิน : " + amount);
        balance = balance - amount;
    }

    public void printDetails() {
        System.out.println("----------");
//        System.out.println("No :" + accountNumber);
//        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------");

    }
}
