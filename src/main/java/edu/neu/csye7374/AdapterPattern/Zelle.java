package edu.neu.csye7374.AdapterPattern;

public class Zelle implements DigitalPaymentAPI{

private static Zelle zelleInstance=new Zelle();
	
	private Zelle() {}
	
	public static Zelle getInstance() {
		return zelleInstance;
	}
	
	@Override
	public void makeDigitalPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("########################### Making a payment of $"+amount+" through Zelle #############################");
	}

}
