package Exercice_4;

public class CurrentConditionsDisplay implements Observer, DisplayMeasurements {
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
		System.out.println("CurrentConditionsDisplay has been updated: temp = " + this.temperature + ", pressure = " + this.pression + ", humidity = " + this.humidity);
	}
}
