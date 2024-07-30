package in.AdapterPattern;


class PaymentAdapter implements NewPaymentGateway
{
	private OldPaymentGateway oldPaymentGateway;

	public PaymentAdapter(OldPaymentGateway oldPaymentGateway) 
	{
		this.oldPaymentGateway = oldPaymentGateway;
	}

	@Override
	public void processPayment(double amount)
	{
		// Adapting the method call to the old payment gateway
		oldPaymentGateway.makePayment((int) amount);
	}
}

