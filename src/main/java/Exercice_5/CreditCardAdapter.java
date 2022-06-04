package Exercice_5;

public class CreditCardAdapter implements ICreditCard {
	private BankDetails bankDetails;

	public CreditCardAdapter() {
		this.bankDetails = new BankDetails();
	}

	public String getCreditCardDetails() {
		return this.bankDetails.getBankName() + " - " + this.bankDetails.getAccountHolderName() + " - " + this.bankDetails.getAccountNumber();
	}
}
