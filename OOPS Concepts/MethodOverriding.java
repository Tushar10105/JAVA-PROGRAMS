class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance=balance;
    }

    double calculateInterest() {
        return balance*0.03;
    }

    void displayInterest() {
		double interest=calculateInterest();
        System.out.println("Interest Earned: "+calculateInterest());
        System.out.println("TOTAL: " + (balance + interest));

    }
}


class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance*0.05;
    }
}


class FixedDepositAccount extends BankAccount {
    FixedDepositAccount(double balance) {
        super(balance);
    }


    double calculateInterest() {
        return balance*0.07;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        BankAccount regular = new BankAccount(10000);
        BankAccount savings = new SavingsAccount(10000);
        BankAccount fixed = new FixedDepositAccount(10000);

        System.out.println("\nRegular Account");
        regular.displayInterest();

        System.out.println("\nSavings Account");
        savings.displayInterest();

        System.out.println("\nFixed Deposit Account");
        fixed.displayInterest();

        System.out.println();
    }
}
