

public class Customer {
	
	private String customerId;
	private String name;
	private String address;
	private String email;
	private String phoneNum;
	private String creditRating;
	
	public Customer() {
		
	}
	
	public Customer(String customerId, String name,String address, String email, String phoneNum, String creditRating) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNum = phoneNum;
		this.creditRating = creditRating;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	
	

	

}
