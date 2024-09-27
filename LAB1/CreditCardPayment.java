package LAB1;

public class CreditCardPayment implements PaymentMethods {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Credit Card.");
    }
}

