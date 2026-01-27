package rt.modeling_elc;

import rt.modeling_blc.Address;
import rt.modeling_blc.Person;

public class Test {

	void main() {
		
		String street = IO.readln("Enter Street : ");
		String city = IO.readln("Enter City : ");
		Address address = new Address(street, city);
		
		String name = IO.readln("Enter Person Name : ");
		Person p = new Person(name, address);
		p.getPersonDetails();

	}

}
