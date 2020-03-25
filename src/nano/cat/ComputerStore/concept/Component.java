package nano.cat.ComputerStore.concept;
/**
 * 
 * @author nano-cat
 *
 */
public abstract class Component {
	
	private double price;	//�۸�λ Ԫ
	private String name;
	
	public Component(String name, double price) {
		this.price = price;
		this.name = name;
	}
	
	public String description() {	//���� {����} �� {�۸�}
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
