package Exercice_3;

public abstract class Logistics {
	public void planDelivery(String destination) {
		Transport transport = createTransport();
		
		transport.deliver(destination);
	}

	public abstract Transport createTransport();
}
