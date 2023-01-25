package patterns.creational.dependencyinjection.storage;

import patterns.creational.dependencyinjection.inventory.Inventory;

/**
* Esta clase representa a una ubicaci�n de almacenamiento mediano, compuesta por un edificio
* formado por una serie de plantas y cada planta con un tama�o de almacenaje.
*
* @author Luis del Moral Mart�nez
*/
public class StorageMedium implements Inventory {

	private int goods;
	private int floors;
	
	public StorageMedium (int goods, int floors)
	{
		this.goods = goods;
		this.floors = floors;
	}
	
	/**
	* Este m�todo, que se implementa debido a la interfaz Inventory, calcula
	* el espacio de almacenamiento (plantas * espacio)
	*/
	@Override
	public int calculateInventoryCapacity() {
		return goods * floors;		
	}
}
