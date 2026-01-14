package practise.lowleveldesign.structural.proxy;

public class RealPayment {
    public void credit(int amount){
        System.out.println("Real Payment Credited " + amount);
    }

    public void debit(int amount){
        System.out.println("Real Payment Debited " + amount);
    }
}
