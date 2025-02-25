import java.util.Scanner;
class Bank{
	double Intrest(double amount){
		return amount*0.04;
		}
		double Intrest(double amount,double rate){
			return amount*(rate/100);
			}
	}

	class SBI extends Bank{
		double Intrest(double amount){
			return amount*0.05;
			}
		}

		class HDFC extends Bank{
			double Intrest(double amount){
				return amount*0.06;
				}
			}


	public class PolymerPhism{
		public static void main(String args[]){

			System.out.println("___CALCULATING BANK INTRESTS___");
			System.out.println("-------------------------------+");

			Bank obj1=new Bank();
			System.out.println("DEFAULT BANK INTREST: "+obj1.Intrest(100000));

			Scanner scan=new Scanner(System.in);
			System.out.print("CUSTOM RATE %: ");
			double rate=scan.nextDouble();
			scan.close();

			System.out.println("CUSTOM BANK INTREST: "+obj1.Intrest(100000,rate));

			Bank obj2=new SBI();
			Bank obj3=new HDFC();
			System.out.println("SBI INTREST: "+obj2.Intrest(100000));
			System.out.println("HDFC INTREST: "+obj3.Intrest(100000));
			System.out.println("-------------------------------+");
			System.out.println();
			}
		}