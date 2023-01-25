package patterns.architectural.mvc.view;

import java.util.List;

import patterns.architectural.mvc.model.Student;

/**
* Esta vista muestra los datos del modelo.
* En el ejemplo, la vista muestra la informaci�n por consola
*
* @author Luis del Moral Mart�nez
*/
public class StudentView {
	
	// Actualiza el valor de la vista imprimiendo un informe de estudiantes
	public void printStudentReport(List<Student> students)
	{
		System.out.println("\n---- List of students -------------------");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
