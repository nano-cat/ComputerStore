package nano.cat.ComputerStore.types;
import nano.cat.ComputerStore.concept.*;
/**
 * 
 * @author Nano-cat
 *
 */
public abstract class Disk extends Component implements Workable {
	
	protected int volume;
	
	public Disk (String name, double price, int volume) {
		super(name, price);
		this.volume = volume;
	}
	
	@Override
	public String description(){	//返回 {名字} {价格} {容量}
		StringBuilder diskDescBuilder = new StringBuilder();
		diskDescBuilder.append(super.description())
			.append(" size(GB):{")
			.append(volume)
			.append(" GB");
		return diskDescBuilder.toString();
	}

}
