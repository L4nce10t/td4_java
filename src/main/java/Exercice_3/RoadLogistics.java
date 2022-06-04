package Exercice_3;

public class RoadLogistics extends Logistics {
	public Transport createTransport() {
		
		return new Truck();
	}
}
