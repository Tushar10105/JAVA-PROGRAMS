interface Payment {
    void makePayment(double amount);
}

class CreditCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " Rupees  using CREDIT CARD.");
    }
}

class PayPalPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " Rupees using PAYPAL");
    }
}

public class InterfaceAbstraction{
    public static void main(String[] args) {
        Payment obj1 = new CreditCardPayment();
        obj1.makePayment(1000);

        Payment obj2 = new PayPalPayment();
        obj2.makePayment(500);

        System.out.println("--------------------------");
    }
}
