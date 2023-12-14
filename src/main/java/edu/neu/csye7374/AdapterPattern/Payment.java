package edu.neu.csye7374.AdapterPattern;

public class Payment implements PaymentAPI {

	public Payment() {
		super();
	}

	PaymentAdapter paymentAdapter;

	@Override
	public void makePayment(String paymentType, double amount) {
		// TODO Auto-generated method stub
		if(paymentType.equalsIgnoreCase("cheque")){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ Making a payment of $"+amount+" through Cheque @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");		
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(paymentType.equalsIgnoreCase("paypal") || paymentType.equalsIgnoreCase("zelle")){
	    	 paymentAdapter = new PaymentAdapter(paymentType);
	    	 paymentAdapter.makePayment(paymentType,amount);
	      }
	      
	      else{
	         System.out.println("Invalid media. " + paymentType + " format not supported");
	      }
	}

}
