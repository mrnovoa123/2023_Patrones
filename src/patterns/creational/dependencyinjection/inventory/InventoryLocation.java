package patterns.creational.dependencyinjection.inventory;

/**
* Esta clase representa al servicio de inventario de la aplicaci�n. La clase admite
* como ubicaci�n de localizaci�n a cualquier objeto que implemente la interfaz
* Inventory
*
* @author Luis del Moral Mart�nez
*/
public class InventoryLocation {
	private Inventory location;
	private String name;
	
	public InventoryLocation (String name, Inventory location)
	{
		this.name = name;
		this.location = location;
	}
	
	/**
	* Devuelve el nombre de la ubicaci�n del inventario
	*/
	public String getName ()
	{
		return this.name;
	}
	
	/**
	* Devuelve la capacidad de la ubicaci�n del inventario
	*/	
	public int getCapacity ()
	{
		return this.location.calculateInventoryCapacity();
	}
}
