package proxyPattern;

public class UPI implements Payment {
	private CashPayment cash = new CashPayment();

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		 if (amount <= 0) {
	            System.out.println("Invalid payment amount. Transaction cancelled.");
	            return;
	        }
		System.out.println("Processing UPI payment...");

		cash.pay(amount);

		System.out.println(" UPI payment successful!");
	}

}
