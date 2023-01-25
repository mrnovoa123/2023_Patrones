package patterns.architectural.mvc;

import patterns.architectural.mvc.controller.StudentController;
import patterns.architectural.mvc.model.Student;
import patterns.architectural.mvc.view.StudentView;

/**
* Clase principal de la aplicaci�n. Permite ejecutar el ejemplo mediante la funci�n main
*
* @author Luis del Moral Mart�nez
*/
public class Demo {

	// M�todo principal de la aplicaci�n. Crea el controlador y usa los m�todos
	// p�blicos que tiene expuestos
	public static void main(String[] args) {
		StudentController controller = new StudentController(new StudentView());
		controller.updateView();
		
		// Se crea un nuevo usuario
		controller.addStudent(new Student("6", "Enrique Garc�a", "egarcia@edu.com"));
		controller.updateView();
		
		// Se borra un usuario
		controller.removeStudent(3);
		controller.updateView();
		
		// Se actualiza un usuario
		Student update = controller.getStudent(1);
		update.setName("Name updated!");
		controller.updateStudent(update, 1);
		controller.updateView();
	}
}
