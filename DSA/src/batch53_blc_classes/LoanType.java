package batch53_blc_classes;

public class LoanType {
		
		public static OfferedLoan getLoanType(LoanApplicant la) {
				OfferedLoan ol = null;
				if(la.getCivilScore()>900) {
					return ol = new OfferedLoan(la, "Gold Loan");
				}else if(la.getCivilScore()>800) {
					return ol =new OfferedLoan(la, "Home");
				}else if(la.getCivilScore()>700) {
					return ol = new OfferedLoan(la, "Personal");
				}else {
					return new OfferedLoan(la, "Small");
				}
		}

}
