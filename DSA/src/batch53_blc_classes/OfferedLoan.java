package batch53_blc_classes;

public class OfferedLoan {
		private LoanApplicant loanApplicant;
		private String loanType;
		
		public OfferedLoan(LoanApplicant loanApplicant, String loanType) {
			this.loanApplicant = loanApplicant;
			this.loanType = loanType;
		}

		public LoanApplicant getLoanApplicant() {
			return loanApplicant;
		}

		public void setLoanApplicant(LoanApplicant loanApplicant) {
			this.loanApplicant = loanApplicant;
		}

		public String getLoanType() {
			return loanType;
		}

		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}

		@Override
		public String toString() {
			return "Loan Applicant Name : "+loanApplicant + " Loan Type : "+loanType;
		}
		
		
		
		
}
