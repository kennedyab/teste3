
public class Item {
	private String name;
	private String id;
	private double price;
	
	public Item(String n, String id, double p) {
		this.id = id;
		this.name = n;
		this.price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
