
public class Product {
	private String name;
	private String description;
	private double price;
	private int maxQuantity;

	public Product(String name, String description, double price, int maxQuantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	@Override
	public String toString() {
		return "Product name: " + name + "\ndescription: " + description + "\nprice: " + price + "\nMax Quantity: "
				+ maxQuantity;
	}

}
