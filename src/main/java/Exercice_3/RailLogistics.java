package Exercice_3;

public class RailLogistics extends Logistics {
	public Transport createTransport() {
		
		return new Train();
	}
}
