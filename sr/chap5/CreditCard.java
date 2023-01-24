package chap5;

public class CreditCard {
    private double minimumSalary;

    private CreditCard(double minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public static CreditCard createCard(double minimumSalary) {
        if (minimumSalary >= 15000) {
            return new CreditCard(minimumSalary);
        } else {
            return null;
        }
    }

    public double getMinimumSalary() {
        return minimumSalary;
    }

    public void setMinimumSalary(double minimumSalary) {
        this.minimumSalary = minimumSalary;
    }
}
