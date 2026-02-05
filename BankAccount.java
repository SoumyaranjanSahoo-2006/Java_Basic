class BankAccount {
	
	String accountNumber;
	String holderName;
	private double balance;
	   
	public BankAccount(String accountNumber, String holderName, double balance) {
	    this.accountNumber = accountNumber;
	       this.holderName = holderName;
	       this.balance = balance;
	}

	   
	   public void deposit(double ammount){
		   if(ammount>0) {
			   balance+=ammount;
			   System.out.println("Your deposited ammount is "+ammount);
		   }
		   else {
			   System.out.println("you deposite 0 ammount.");
		   }
		   
	   }
	   
	   public void withdraw(double ammount) {
		   if(ammount>0 && ammount<=balance) {
			   balance-=ammount;
			   System.out.println("your deposited ammount is "+ammount);
		   }
		   else {
			   System.out.println("Insufficent balance in account.");
		   }
		   
	   }
	   
	   public void checkBalance() {
		   System.out.println("Current balance is "+balance);
		   
	   }   
}
	

class MainClass {


		public static void main (String[]args) {
			BankAccount b1 =new BankAccount( "ABC14520kk","Soumya",7000);
			
			 // checking initial balance
	        b1.checkBalance();

	        // depositing money
	        b1.deposit(2000);

	        // checking balance
	        b1.checkBalance();

	        // withdrawing money
	        b1.withdraw(1500);

        // checking balance
        b1.checkBalance();

			
			
			
		
	}

}
