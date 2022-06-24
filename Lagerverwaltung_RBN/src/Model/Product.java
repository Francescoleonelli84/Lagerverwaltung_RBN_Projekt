
public class Product {


	private String name;
	private String productId;
	private double purchase_price;
	private double selling_price;
	private String decription;
	private int quantity;

	public Product(String productId, String name,  double purchase_price, double selling_price, int quantity, String description) {
		this.name = name;
		this.productId = productId;
		this.purchase_price = purchase_price;
		this.selling_price = selling_price;
		this.quantity = quantity;
		this.decription = description;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}

	public double getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(double selling_price) {
		this.selling_price = selling_price;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
}