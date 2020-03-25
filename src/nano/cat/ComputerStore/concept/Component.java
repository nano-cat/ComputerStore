package nano.cat.ComputerStore.concept;
/**
 * 
 * @author nano-cat
 *
 */
public abstract class Component {
	
	private double price;	//价格单位 元
	private String name;
	
	public Component(String name, double price) {
		this.price = price;
		this.name = name;
	}
	
	public String description() {	//返回 {名字} 和 {价格}
		StringBuilder descriptionBuilder = new StringBuilder();
		descriptionBuilder.append("Name:{")
			.append(name)
			.append("}; Price:{")
			.append(price)
			.append("};");
		return descriptionBuilder.toString();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
