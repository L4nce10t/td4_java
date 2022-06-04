package Exercice_5;

public class CreditCardUsageDemo {
	public static void main(String[] args) {
		ICreditCard cc = new CreditCardAdapter();
		CreditCardUser ccu = new CreditCardUser(cc);

		ccu.displayMyCreditCardDetails();
	}
}
