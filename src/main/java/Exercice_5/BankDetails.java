package Exercice_5;

public class BankDetails {
	private long accountNumber;
	private String accountHolderName;
	private String bankName;

	public BankDetails() {
		this.bankName = "ING Bank";
		this.accountHolderName = "Mr. and Ms. John Doe";
		this.accountNumber = 123321;
	}

	public void setAccountNumber(long nb) {
		this.accountNumber = nb;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountHolderName(String name) {
		this.accountHolderName = name;
	}

	public String getAccountHolderName() {
		return this.accountHolderName;
	}

	public void setBankName(String name) {
		this.bankName = name;
	}

	public String getBankName() {
		return this.bankName;
	}
}
