package practise.lowleveldesign.behavioral.strategy;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentStrategy upiPayment = new UpiPayment();
        PaymentStrategy creditCardPayment = new CreditCardPayment();

        PaymentProcessor upiPaymentProcessor = new PaymentProcessor(upiPayment);
        upiPaymentProcessor.processPayment();

        PaymentProcessor creditCardPaymentProcessor = new PaymentProcessor(creditCardPayment);
        creditCardPayment.processPayment();
    }
}
