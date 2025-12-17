package batch53_blc_classes;

public class Customer {
	private String customerName;
	private int creditPoint;
	
	public Customer(String customerName, int creditPoint) {
		this.customerName = customerName;
		this.creditPoint = creditPoint;
	}
	
	public int getCreditPoint() {
		return creditPoint;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + "]";
	}
	
}
