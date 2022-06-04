package Exercice_7;

import java.util.ArrayList;
import java.util.List;

public class StudentModel implements IStudentModel {
	private ArrayList<IStudentView> observers;
	private String name;
	private String rollNo;


	public StudentModel() {
		this.observers = new ArrayList<>();
		this.name = null;
		this.rollNo = null;
	}

	public void registerObserver(IStudentView o) {
		observers.add(o);
	}

	public void removeObserver(IStudentView o) {
		int index = observers.indexOf(o);

		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		System.out.println("notify observers");

		List<String> studentInfo = new ArrayList<>();
		studentInfo.add(this.name);
		studentInfo.add(this.rollNo);

		for (IStudentView o : observers) {
			o.update(studentInfo);
		}
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
		notifyObservers();
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}

	public String getName() {
		return name;
	}
}
