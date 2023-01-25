package patterns.creational.dependencyinjection.storage;

import patterns.creational.dependencyinjection.inventory.Inventory;

/**
* Esta clase representa a una ubicaci�n de almacenamiento peque�o, compuesta por un edificio
* de una �nica planta con su espacio de almacenamiento limitado.
*
* @author Luis del Moral Mart�nez
*/
public class StorageSmall implements Inventory {

	private int goods;
	
	public StorageSmall (int goods)
	{
		this.goods = goods;
	}
	
	/**
	* Este m�todo, que se implementa debido a la interfaz Inventory, calcula
	* el espacio de almacenamiento (espacio)
	*/
	@Override
	public int calculateInventoryCapacity() {
		return goods;		
	}
}
