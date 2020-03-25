package nano.cat.ComputerStore.product;

import nano.cat.ComputerStore.concept.*;
import nano.cat.ComputerStore.types.CPU;
import nano.cat.ComputerStore.types.Disk;

/**
 * 
 * @author Nano-cat
 *
 */
public class Computer extends Component implements Workable{
	
	private CPU cpu;
	private Disk disk;
	
	public Computer(String name, CPU cpu, Disk disk) {
		super(name, -1);
		this.cpu = cpu;
		this.disk = disk;
		super.setPrice(cpu.getPrice() + disk.getPrice());
	}
	
	public void work() {
		cpu.work();
		disk.work();
	}
	
	@Override
	public String description() {	
		StringBuilder computerDescBuilder = new StringBuilder();
		computerDescBuilder.append(super.description())	// 电脑{名字}和{价格}
			.append("CPU description: {")
			.append(cpu.description())	//  {名字} {价格} {核数}
			.append("}; Disk description: {") 
			.append("}");
		return computerDescBuilder.toString();
	}
}
