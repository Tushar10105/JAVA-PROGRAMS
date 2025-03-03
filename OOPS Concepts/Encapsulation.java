import java.util.Scanner;

class BankAccount{
	String AccountHolder;
	double Balance;

	BankAccount(String AccountHolder,double Balance){
		this.AccountHolder=AccountHolder;
		this.Balance=Balance;
		}

		public String getAccountHolder(){
			return AccountHolder;
			}

			public void setAccountHolder(String AccountHolder){
				this.AccountHolder=AccountHolder;
				}

				public double getBalance(){
					return Balance;
					}

					public void Deposit(double amount){
						if(amount>0){
							Balance+=amount;
							System.out.println("YOU ARE DIPOSITED: "+amount);
							}else{
								System.out.println("INVALID AMOUNT DIPOSITED");
								}
						}

						public void Withdraw(double amount){
							if(amount>0 && amount<=Balance){
								Balance-=amount;
								System.out.println("WITHDRAW: "+amount);
								}else{
									System.out.print("INSUFFICIENT or INVALID AMMOUNT");
									}
							}

	}

	public class Encapsulation{
		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);

			System.out.println("------------------BANK ACCOUNT-----------------\n");

			BankAccount acc=new BankAccount("TUSHAR KANT",300000);
			System.out.println("ACCOUNT HOLDER: "+acc.getAccountHolder());
			System.out.println("INITIAL BALANCE: "+acc.getBalance());

			while (true) {
		        System.out.println("\nChoose an option:");
		        System.out.println("1. Deposit");
		        System.out.println("2. Withdraw");
		        System.out.println("3. Exit");
		        System.out.print("Enter your choice: ");

		        int choice = scan.nextInt();

			            switch (choice) {
			                case 1:
			                    System.out.print("ENTER AMOUNT TO DEPOSIT: ");
			                    double depositAmount=scan.nextDouble();
			                    acc.Deposit(depositAmount);
			                    break;
			                case 2:
			                    System.out.print("ENTER AMOUNT TO WITHDRAW: ");
			                    double withdrawAmount=scan.nextDouble();
			                    acc.Withdraw(withdrawAmount);
			                    break;
			                case 3:
			                    System.out.println("Exiting... Thank you!");
			                    scan.close();
			                    return;
			                default:
			                    System.out.println("INVALID CHOICE! PLEASE TRY AGAIN.");
			            }

			            System.out.println("UPDATED BALANCE: "+ acc.getBalance());
			        }
			    }
}