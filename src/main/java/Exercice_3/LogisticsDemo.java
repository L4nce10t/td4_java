package Exercice_3;

public class LogisticsDemo {
	public static void main(String[] args) {
		Logistics rl = new RoadLogistics();
		rl.planDelivery("Kiev");

		Logistics sl = new SeaLogistics();
		sl.planDelivery("Odessa");

		Logistics tl = new RailLogistics();
		tl.planDelivery("Lviv");
	}
}
