package Exercice_3;

public class Train implements Transport {
	public void deliver(String destination) {
		System.out.println("Deliver by train to " + destination);
	}
}
