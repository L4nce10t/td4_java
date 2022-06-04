package Exercice_7;

public interface IStudentModel {
	public void registerObserver(IStudentView o);

	public void removeObserver(IStudentView o);

	public void notifyObservers();

	public void setRollNo(String rollNo);

	public String getRollNo();

	public void setName(String name);

	public String getName();
}
