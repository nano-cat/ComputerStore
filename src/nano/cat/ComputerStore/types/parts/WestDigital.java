package nano.cat.ComputerStore.types.parts;

import nano.cat.ComputerStore.types.Disk;

/**
 * 
 * @author Nano-cat
 *
 */
public class WestDigital extends Disk{
	
	public WestDigital (String name, double price, int volume) {
		super(name, price, volume);
	}
	
	public void work() {
		System.out.println("This is WestDigital disk working");
	}
}
