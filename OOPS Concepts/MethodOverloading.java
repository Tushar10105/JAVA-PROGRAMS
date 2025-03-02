class BankAccount{
	double balance;
	BankAccount(double initialBalance){
		balance=initialBalance;
		}

		void deposit(int amount){
			balance+=amount;
			System.out.println("DEPOSITED: "+amount);
			}

		void deposit(double amount){
			balance+=amount;
			System.out.println("DEPOSITED: "+amount);
			}

		void deposit(double amount,String message){
			balance+=amount;
			System.out.println("DEPOSITED: "+ amount+ " (" + message + ")");
			}

		void Display(){
			System.out.println("CURRENT BALANCE: "+balance);
			}

	}

	public class MethodOverloading{
		public static void main(String arags[]){
			BankAccount acc=new BankAccount(10000);
			acc.deposit(5000);
			acc.deposit(2000);
			acc.deposit(30000,"SALARY CREDITED");

			acc.Display();
			}
		}