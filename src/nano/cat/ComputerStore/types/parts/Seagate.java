package nano.cat.ComputerStore.types.parts;

import nano.cat.ComputerStore.types.Disk;
/**
 * 
 * @author Nano-cat
 *
 */
public class Seagate extends Disk{

	public Seagate (String name, double price, int volume ) {
		super(name, price, volume);
	}
	
	public void work() {
		System.out.println("This is seagate disk working");
	}
}
