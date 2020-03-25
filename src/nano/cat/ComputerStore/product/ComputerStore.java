package nano.cat.ComputerStore.product;
import nano.cat.ComputerStore.product.Computer;
import nano.cat.ComputerStore.types.*;
import nano.cat.ComputerStore.types.parts.*;
/**
 * 
 * @author Nano-cat
 *
 */
public class ComputerStore {

	public static void main(String[] args) {
		//定义第一台电脑的部件
		CPU intel = new IntelCPU("intel i5", 6, 1599);
		Disk seagate = new Seagate("Seagate disk", 1000, 40960);
		
		//组装第一台机器并工作
		Computer computer1 = new Computer("computer 1", intel, seagate);
		System.out.println("computer 1 description: " + computer1.description());
		System.out.println("computer 1 work: ");
		computer1.work();
		
		//定义第二胎电脑的部件
		CPU amd = new AMDCPU("AMD r7", 8, 2599);
		Disk westdigital = new WestDigital("West Digital disk", 2000, 81920);
		
		//组装第二台机器并工作
		Computer computer2 = new Computer("computer 2", amd, westdigital);
		System.out.println("computer 2 description: " + computer2.description());
		System.out.println("computer 2 work: ");
		computer2.work();
	}

}
