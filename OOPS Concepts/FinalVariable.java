class Account{
	final String accno;
	final double interest=4.5;
	static double amount=500000;

	Account(String accno){
		this.accno=accno;
		}

		double Calculate(){
			double last=amount+(amount*(this.interest/100));
			return last;
			}

	void Display(){
		System.out.println("ACCOUNT NUMBER: "+accno);
		System.out.println("FIXED INTEREST RATE: "+interest+"%");
		}
	}

	public class FinalVariable{
		public static void main(String args[]){
			Account acc=new Account("96870345672932");
			System.out.println("-------ACCOUNT DETAILS-------");
			acc.Display();
			System.out.println("\nAMOUNT: "+Account.amount+"\nCALCULATED AMOUNT: "+acc.Calculate()+"\n");


			//ERROR: Can't modify final variable..
			//acc.accno = "9876543210";
        	//acc.interest= 5.0;

			}
		}