public class StoreOneA extends StoreToRent {
        private final double DISCOUNT_RATE = 0.25;
        private boolean specialCustomer;
        private double monthlyPayment;
        public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm,boolean specialCustomer) {
            super(loanRequired, loanAmount, loanPaymentTerm);
            this.specialCustomer = specialCustomer;
        }
        public void  showStoreInfo(){
            System.out.println(toString());
        }
        public double  calculateLoanFinancing(){
            this.monthlyPayment = super.calculateLoanFinancing();
            if(specialCustomer == true){
                monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
            return this.monthlyPayment;
        }else{
            return this.monthlyPayment;
        }
    }
    public String toString(){
        return super.toString() + "LOAN DETAILS (if applicable):\n" + 
        "Loan Amount: " + super.getLoanAmount() +"\n" + 
        "Loan Payment Term:" + super.getLoanPaymentTerm() +"\n" + 
        "Interest Rate: " + super.getINTEREST_RATE() + "\n" + 
        "Special Customer:" + specialCustomer +"\n" + 
        "Monthly Loan Payment:" + monthlyPayment + "\n";
    }
}
