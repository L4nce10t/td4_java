package Exercice_4;

public class StatisticsDisplay implements Observer, DisplayMeasurements {
	private double temperature;
	private double pression;
	private double humidity;

	public void update(double T, double P, double H) {
		this.temperature = T;
		this.pression = P;
		this.humidity = H;
		display();
	}

	public void display() {
		System.out.println("StatisticsDisplay has been updated");
	}
}
