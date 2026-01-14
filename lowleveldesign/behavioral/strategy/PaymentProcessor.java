package practise.lowleveldesign.behavioral.strategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // Constructor to set the payment strategy
    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    // process payment using current strategy
    public void processPayment() {
        paymentStrategy.processPayment();
    }

    // Dynamically change payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
