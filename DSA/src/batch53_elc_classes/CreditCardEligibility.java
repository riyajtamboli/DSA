package batch53_elc_classes;

import batch53_blc_classes.CardOnOffer;
import batch53_blc_classes.CardType;
import batch53_blc_classes.Customer;

public class CreditCardEligibility {

	public static void main(String[] args) {
		String name = IO.readln("Enter Name : ");
		int creditPoint = Integer.parseInt(IO.readln("Enter Credit Point : "));
		Customer customer = new Customer(name, creditPoint);
		
		CardType cardType = CardOnOffer.getOfferedCard(customer);
		
		IO.println(cardType);
	}

}
