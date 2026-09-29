package PolymorphismTask_Banking;

public class Payment {

	 int paymentId;
	    double amount;

	    Payment(int paymentId, double amount) {
	        this.paymentId = paymentId;
	        this.amount = amount;
	    }

	    void makePayment() {
	        System.out.println("Payment processing...");
	    }

	    void generateReceipt() {
	        System.out.println("Payment receipt generated.");
	    }
	}


	// Credit Card Payment
	class CreditCardPayment extends Payment {

	    CreditCardPayment(int paymentId, double amount) {
	        super(paymentId, amount);
	    }

	    @Override
	    void makePayment() {
	        System.out.println("Processing Credit Card Payment...");
	        System.out.println("Credit card payment of Rs." + amount + " successful.");
	    }

	    @Override
	    void generateReceipt() {
	        System.out.println("Credit Card Receipt");
	        System.out.println("Payment ID: " + paymentId);
	        System.out.println("Amount: Rs." + amount);
	    }
	}


	// UPI Payment
	class UPIPayment extends Payment {

	    UPIPayment(int paymentId, double amount) {
	        super(paymentId, amount);
	    }

	    @Override
	    void makePayment() {
	        System.out.println("Processing UPI Payment...");
	        System.out.println("UPI payment of Rs." + amount + " successful.");
	    }

	    @Override
	    void generateReceipt() {
	        System.out.println("UPI Receipt");
	        System.out.println("Payment ID: " + paymentId);
	        System.out.println("Amount: Rs." + amount);
	    }
	}


	// Net Banking Payment
	class NetBankingPayment extends Payment {

	    NetBankingPayment(int paymentId, double amount) {
	        super(paymentId, amount);
	    }

	    @Override
	    void makePayment() {
	        System.out.println("Processing Net Banking Payment...");
	        System.out.println("Net Banking payment of Rs." + amount + " successful.");
	    }

	    @Override
	    void generateReceipt() {
	        System.out.println("Net Banking Receipt");
	        System.out.println("Payment ID: " + paymentId);
	        System.out.println("Amount: Rs." + amount);
	    }
	}


	// Wallet Payment
	class WalletPayment extends Payment {

	    WalletPayment(int paymentId, double amount) {
	        super(paymentId, amount);
	    }

	    @Override
	    void makePayment() {
	        System.out.println("Processing Wallet Payment...");
	        System.out.println("Wallet payment of Rs." + amount + " successful.");
	    }

	    @Override
	    void generateReceipt() {
	        System.out.println("Wallet Receipt");
	        System.out.println("Payment ID: " + paymentId);
	        System.out.println("Amount: Rs." + amount);
	    }
	}


	   
	
