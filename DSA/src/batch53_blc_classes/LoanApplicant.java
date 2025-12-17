package batch53_blc_classes;

public class LoanApplicant {
		private String laonApplicant;
		private int civilScore;
		
		
		public LoanApplicant(String laonApplicant, int civilScore) {
			this.laonApplicant = laonApplicant;
			this.civilScore = civilScore;
		}


		public String getApplicantName() {
			return laonApplicant;
		}


		public void setApplicantName(String laonApplicant) {
			this.laonApplicant = laonApplicant;
		}


		public int getCivilScore() {
			return civilScore;
		}


		public void setCivilScore(int civilScore) {
			this.civilScore = civilScore;
		}


		@Override
		public String toString() {
			return laonApplicant;
		}
		
		
		
}
