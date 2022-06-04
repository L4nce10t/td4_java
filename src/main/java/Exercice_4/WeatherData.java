package Exercice_4;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private double temperature;
	private double pression;
	private double humidity;

	public WeatherData() {
		this.observers = new ArrayList<>();
		this.temperature = 0.0;
		this.pression = 0.0;
		this.humidity = 0.0;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);

		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		int i;
		Observer o;
		System.out.println("notify observers");

		for (i = 0; i < observers.size(); i++) {
			o = observers.get(i);
			o.update(temperature, pression, humidity);
		}
	}

	public void setTemperature(double t) {
		temperature = t;
		measurementChanged();
	}

	public void setPression(double p) {
		pression = p;
		measurementChanged();
	}

	public void setHumidity(double h) {
		humidity = h;
		measurementChanged();
	}

	public void measurementChanged() {
		notifyObservers();
	}
}
