package proxyPattern;

public class Main {
public static void main(String []args) {
	Payment cash = new CashPayment();
    Payment upi = new UPI();
    Payment card = new Card("1234-5678-9876-5432");
    Payment netBanking = new NetBanking("ACC987654");

    cash.pay(500);
    System.out.println();
    upi.pay(1000);
    card.pay(2000);
    netBanking.pay(3000);
	
}
}
