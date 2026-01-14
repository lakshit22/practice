package practise.lowleveldesign.behavioral.strategy;

// concrete strategy
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing CreditCardPayment");
    }
}
