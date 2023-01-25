package patterns.creational.dependencyinjection;

import patterns.creational.dependencyinjection.inventory.*;
import patterns.creational.dependencyinjection.storage.*;

/**
* Clase principal de la aplicaci�n. Permite ejecutar el ejemplo mediante la funci�n main
*
* @author Luis del Moral Mart�nez
*/
public class Demo {

	public static void main(String[] args) {
		// Se configuran diferenets ubicaciones de inventario. En el constructor
		// se inyectan las diferentes dependencias
		InventoryLocation sevilla = new InventoryLocation ("Sevilla", new StorageLarge(150, 3, 2));
		InventoryLocation cordoba = new InventoryLocation ("C�rdoba", new StorageMedium(50, 2));
		InventoryLocation malaga = new InventoryLocation ("M�laga", new StorageSmall(15));
		
		// Se obtienen y se muestran los valores de capacidad total de cada ubicaci�n.
		System.out.println("Total capacity of site " + sevilla.getName() + ": " + sevilla.getCapacity());
		System.out.println("Total capacity of site " + cordoba.getName() + ": " + cordoba.getCapacity());
		System.out.println("Total capacity of site " + malaga.getName() + ": " + malaga.getCapacity());
	}

}
