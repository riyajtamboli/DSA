package rt.modeling_blc;

public class Person {
		
	private String name;
	private Address address;
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void getPersonDetails() {
		IO.println("Person Name : "+this.name+"\nAddress : "+this.address);
	}
	
}
