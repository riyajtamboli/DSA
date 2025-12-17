package batch53_blc_classes;

public class CardType {
		private Customer customer;
		private String cardType;
		
		
		public CardType(Customer customer, String cardType) {
			this.customer = customer;
			this.cardType = cardType;
		}


		@Override
		public String toString() {
			return "CardType [" + customer + ", cardType=" + cardType + "]";
		}
		
		
		
}
