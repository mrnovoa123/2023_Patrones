package patterns.architectural.mvc.controller;

import java.util.List;

import patterns.architectural.mvc.model.*;
import patterns.architectural.mvc.view.StudentView;

/**
* Esta clase es el controlador de la aplicaci�n. Tiene la l�gica de negocio
* y los m�todos que pueden ser ejecutados con el modelo de negocio
*
* @author Luis del Moral Mart�nez
*/
public class StudentController {

	private StudentModel model;
    private StudentView view;
 
    public StudentController(StudentView view, StudentModel model) {
       this.view = view;
       this.model = model;
    }
    
    public StudentController(StudentView view) {
        this.view = view;
        this.model = new StudentModel();
        generateDummyModel();
     }
    
    // A�ade un estudiante al modelo
    public void addStudent (Student student)
    {
    	model.addStudent(student);
    }
    
    // Devuelve un estudiante del modelo
    public Student getStudent (int i)
    {
    	return model.getStudent(i);
    }
    
    // Devuelve todos los estudiantes del modelo
    public List<Student> getAllStudents ()
    {
    	return model.getAllStudents();
    }
    
	// Borra un estudiante del modelo de datos
	public void removeStudent (int i)
	{
		model.removeStudent(i);
	}
	
	// Actualiza un estudiante del modelo de datos
	public void updateStudent (Student student, int i)
	{
		model.updateStudent(student, i);
	}
	
	// Actualiza la vista de la aplicaci�n
	public void updateView ()
	{
		view.printStudentReport (model.getAllStudents());
	}
	
	// Genera un modelo de datos de prueba
	private void generateDummyModel()
	{
		model.addStudent(new Student("1", "Luis S�nchez", "lsanchez@edu.com"));
		model.addStudent(new Student("2", "Ver�nica Rodr�guez", "vrodriguez@edu.com"));
		model.addStudent(new Student("3", "Marcos Alcaide", "malcaide@edu.com"));
		model.addStudent(new Student("4", "Sim�n Vel�zquez", "svelazquez@edu.com"));
		model.addStudent(new Student("5", "Luc�a Jim�nez", "ljimenez@edu.com"));
	}
}
