package LAB1;

public class BkashPayment implements PaymentMethods {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Bkash.");
    }
}
