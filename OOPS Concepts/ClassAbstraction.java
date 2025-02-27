abstract class Payment{
	double amount;
	Payment(double amount){
		this.amount=amount;
		}

	abstract void makePayment();
	void paymentSummary(){
		System.out.println("Payment of "+amount+" Rupees is being PROCESSED");
		}
	}

	class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Paid " + amount + " Rupees using CREDIT CARD");
    }
}

class PayPalPayment extends Payment {
    PayPalPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Paid " + amount + " Rupees using PAYPAL");
    }
}

public class ClassAbstraction{
    public static void main(String[] args) {
        Payment obj1 = new CreditCardPayment(1000);
        obj1.paymentSummary();
        obj1.makePayment();

        Payment obj2 = new PayPalPayment(500);
        obj2.paymentSummary();
        obj2.makePayment();
        System.out.println();
    }
}
