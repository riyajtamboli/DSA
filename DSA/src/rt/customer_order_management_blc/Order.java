package rt.customer_order_management_blc;

public class Order {
		private String orderId;
		private String itemName;
		private double price;
		
		public Order(String orderId, String itemName, double price) {
			super();
			this.orderId = orderId;
			this.itemName = itemName;
			this.price = price;
		}

		public String getOrderId() {
			return orderId;
		}

		public String getItemName() {
			return itemName;
		}

		public double getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
		}
		
		
}
