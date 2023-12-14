package edu.neu.csye7374.AdapterPattern;

public class PaymentAdapter implements PaymentAPI {
	
	DigitalPaymentAPI digitalPaymentAPI;
	
	public PaymentAdapter(String paymentType) {
		if(paymentType.equalsIgnoreCase("paypal") ){
			digitalPaymentAPI = Paypal.getInstance();
        }
		else if (paymentType.equalsIgnoreCase("zelle")){
			digitalPaymentAPI = Zelle.getInstance();
		}	
	}

	@Override
	public void makePayment(String paymentType, double amount) {
		// TODO Auto-generated method stub
		digitalPaymentAPI.makeDigitalPayment(amount);		
	}
}
