package Exercice_7;

import java.util.ArrayList;
import java.util.List;

public class StudentController implements IStudentController {
	private IStudentModel model;
	private IStudentView view;

	public StudentController(IStudentModel model) {
		this.model = model;
		this.view = new StudentView(model, this);
	}

	public void setStudentName(String name) {
		this.model.setName(name);
	}

	public String getStudentName() {
		return this.model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		this.model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return this.model.getRollNo();
	}

	public void updateView() {
		System.out.println("--- StudentInfo View ---");

		List<String> studentInfo = new ArrayList<>();
		studentInfo.add(getStudentName());
		studentInfo.add(getStudentRollNo());

		this.view.update(studentInfo);
	}
}
