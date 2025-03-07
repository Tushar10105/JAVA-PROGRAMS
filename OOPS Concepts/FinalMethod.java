class Bank{
	final void Transaction(double amount){
		System.out.println("TRANSACTION of RUPEES "+amount+" is being PROCESSED");
		System.out.println("TRANSACTION SUCCESSFULL");
		}
	}

	class SavingAccount extends Bank{
		//void Transaction(double amount){
			//System.out.println("PROCESSING transaction in SAVING ACCOUNT");		//error: Transaction(double) in SavingAccount cannot override Transaction(double) in Bank
																					//		void Transaction(double amount){
					   																			//^
  																					//overridden method is final
			//}
		}

		public class FinalMethod{
			public static void main(String args[]){
				SavingAccount acc=new SavingAccount();
				acc.Transaction(50000);
				}
			}
