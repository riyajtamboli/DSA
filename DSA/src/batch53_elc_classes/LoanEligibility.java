package batch53_elc_classes;

import batch53_blc_classes.LoanApplicant;
import batch53_blc_classes.LoanType;
import batch53_blc_classes.OfferedLoan;

public class LoanEligibility {

	public static void main(String[] args) {
		String loanApplicant = IO.readln("Enter Name Of Applicant : ");
		int civilScore = Integer.parseInt(IO.readln("Enter Civil Score : "));
		LoanApplicant la = new LoanApplicant(loanApplicant, civilScore);
		OfferedLoan ol = LoanType.getLoanType(la);
		IO.print(ol);
	}

}
