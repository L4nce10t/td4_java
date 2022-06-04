package Exercice_3;

public class SeaLogistics extends Logistics {
	public Transport createTransport() {
		
		return new Ship();
	}
}
