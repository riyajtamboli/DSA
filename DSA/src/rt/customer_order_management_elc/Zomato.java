package rt.customer_order_management_elc;



import rt.customer_order_management_blc.Customer;
import rt.customer_order_management_blc.Order;

public class Zomato {

	void main() 
	{
		String orderId = IO.readln("Enter Order Id : ");
		String ItemName = IO.readln("Enter Product Name : ");
		double price = Double.parseDouble(IO.readln("Enter Price : "));
		Order order = new Order(orderId, ItemName, price);
		String customerName = IO.readln("Enter Customer Name :");
		String email = IO.readln("Enter Email : ");
		String address = IO.readln("Enter Address : ");
		long mobileNo = Long.parseLong(IO.readln("Enter Mobile No : "));
		
		Customer customer = new Customer(customerName, email,address, mobileNo, order);
		IO.println(customer);
		

	}

}
