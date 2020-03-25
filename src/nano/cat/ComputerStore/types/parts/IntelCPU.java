package nano.cat.ComputerStore.types.parts;
import nano.cat.ComputerStore.types.CPU;
/**
 * 
 * @author Nano-cat
 *
 */
public class IntelCPU extends CPU{
	
	public IntelCPU(String name, int coreNum, double price) {
		super(name, coreNum, price);
	}
	
	public void work() {
		System.out.println("This is Intel's CPU working");
	}
}
