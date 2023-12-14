package edu.neu.csye7374.AdapterPattern;

public class Paypal implements DigitalPaymentAPI {

	private static Paypal paypalInstance;
	
	private Paypal(){
		super();
		paypalInstance =null;
	}
	
	public static synchronized Paypal getInstance() {
		if (paypalInstance == null) {
			paypalInstance = new Paypal();
		}
		return paypalInstance;
	}
	
	@Override
	public void makeDigitalPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------Making a payment of $"+amount+" through Paypal---------------------------");
	}
}
