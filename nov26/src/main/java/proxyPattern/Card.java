package proxyPattern;

public class Card implements Payment {
    private String cardNumber;
    private CashPayment cash = new CashPayment();

    public Card(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid card payment amount.");
            return;
        }
        System.out.println("Processing card payment  " );
        cash.pay(amount);
        System.out.println(" using Card "+ cardNumber);
    }
}
