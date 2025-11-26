package proxyPattern;

public class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.print(amount+"  is paid");
		
	}
	
}
