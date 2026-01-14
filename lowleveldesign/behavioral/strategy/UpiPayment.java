package practise.lowleveldesign.behavioral.strategy;

// concrete strategy
public class UpiPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}
