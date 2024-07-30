package in.AdapterPattern;


public class Client
{
	public static void main(String[] args)
	{
		OldPaymentGateway oldPaymentGateway = new OldPaymentGateway();
		NewPaymentGateway paymentAdapter = new PaymentAdapter(oldPaymentGateway);

   
		paymentAdapter.processPayment(100.50);
	}
}
