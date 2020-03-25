package nano.cat.ComputerStore.types;
import nano.cat.ComputerStore.concept.*;
/**
 * 
 * @author Nano-cat
 *
 */
public abstract class CPU extends Component implements Workable {
	
	protected int coreNum;
	
	public CPU(String name, int coreNum, double price) {
		super(name, price);
		this.coreNum = coreNum;
	}
	
	@Override
	public String description() {	//返回 {名字} {价格} {核数}
		StringBuilder cpuDescBuilder = new StringBuilder();
		cpuDescBuilder.append(super.description())
			.append(" Core Num:{")
			.append(coreNum)
			.append("}");
		return cpuDescBuilder.toString();
	}
}
