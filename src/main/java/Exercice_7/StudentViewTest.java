package Exercice_7;

public class StudentViewTest {
	public static void main(String[] args) {
		StudentModel model = new StudentModel();
		StudentController controller = new StudentController(model);
		controller.updateView();
	}
}
