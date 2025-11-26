package proxyPattern;

public class NetBanking implements Payment {
    private String accountNumber;
    private CashPayment cash = new CashPayment();

    public NetBanking(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid net banking payment amount.");
            return;
        }
        System.out.println("Processing net banking payment from account: " + accountNumber);
        
        cash.pay(amount);
        System.out.print(" using Net Banking.");
    }
}
