final class PaymentGetway{
	void Payment(double amount){
		System.out.println("PROCESSING SECURE PAYMENT of Amount: "+amount);
		System.out.println("PAYMENT SUCCESSFUL");
		}
	}
	//ERROR: can't EXTEND FINAL CLASS
	//error: cannot inherit from final PaymentGetway
	/*
	class OnlinePayment extends PaymentGetway{
		void Payment(double amount){
			System.out.println("PROCESSING ONLINE PAYMENT");
			}
		}
	*/

public class FinalClass{
	public static void main(String args[]){
		PaymentGetway payment=new PaymentGetway();
		payment.Payment(25000);
		}
	}