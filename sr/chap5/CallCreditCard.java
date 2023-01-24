package chap5;

public class CallCreditCard {
    public static void main(String[] args) {
        CreditCard cd = CreditCard.createCard(15000);
        System.out.println("object = "+cd);
    }
}
