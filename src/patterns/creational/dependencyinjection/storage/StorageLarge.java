package patterns.creational.dependencyinjection.storage;

import patterns.creational.dependencyinjection.inventory.Inventory;

/**
* Esta clase representa a una ubicaci�n de almacenamiento grande, compuesta por edificios,
* cada uno formado por una serie de plantas y cada planta con un tama�o de almacenaje.
*
* @author Luis del Moral Mart�nez
*/
public class StorageLarge implements Inventory {

	private int goods;
	private int floors;
	private int buildings;
	
	public StorageLarge (int goods, int floors, int buildings)
	{
		this.goods = goods;
		this.floors = floors;
		this.buildings = buildings;
	}
	
	/**
	* Este m�todo, que se implementa debido a la interfaz Inventory, calcula
	* el espacio de almacenamiento (edificios * plantas * espacio)
	*/
	@Override
	public int calculateInventoryCapacity() {
		return goods * floors * buildings;
	}
}
