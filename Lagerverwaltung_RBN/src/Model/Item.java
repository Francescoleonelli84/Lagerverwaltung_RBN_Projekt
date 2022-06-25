package Model;

public class Item {

	private int itemID;
	private String name;
	private int purchasePrice;
	private int sellingPrice;
	private String description;
	private int quantity;
	
	
	public Item(String name,  int purchasePrice, int sellingPrice, String description, int quantity) {
		this.name = name;	
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.description = description;
		this.quantity = quantity;
	}


	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPurchasePrice() {
		return purchasePrice;
	}


	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}


	public int getSellingPrice() {
		return sellingPrice;
	}


	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

	
	
}
