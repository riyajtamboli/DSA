package batch53_blc_classes;

public class CardOnOffer {
		public static CardType getOfferedCard(Customer customer) {
			int creditPoint = customer.getCreditPoint();
			
			if(creditPoint  < 100) {
				return new CardType(customer, "EMI");
			}else if(creditPoint > 100 && creditPoint < 500) {
				return new CardType(customer, "Silver");
			}else if(creditPoint > 500 && creditPoint < 1000) {
				return new CardType(customer, "Gold");
			}else {
				return new CardType(customer, "Platenium");
			}
		}
}
