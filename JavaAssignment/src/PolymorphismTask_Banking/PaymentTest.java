package PolymorphismTask_Banking;

public class PaymentTest {
	 // Common method for all payment types
    static void processPayment(Payment payment) {

        payment.makePayment();
        payment.generateReceipt();

        System.out.println("---------------------------");
    }


    public static void main(String[] args) {

        // Parent references pointing to child objects
        Payment p1 = new CreditCardPayment(101, 5000);
        Payment p2 = new UPIPayment(102, 2500);
        Payment p3 = new NetBankingPayment(103, 7500);
        Payment p4 = new WalletPayment(104, 1200);


        // Common method
        processPayment(p1);
        processPayment(p2);
        processPayment(p3);
        processPayment(p4);
    }
}
