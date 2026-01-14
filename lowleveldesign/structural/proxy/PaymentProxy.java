package practise.lowleveldesign.structural.proxy;

public class PaymentProxy implements Payment{
    private int amount;

    public PaymentProxy(int amount){
        this.amount = amount;
        System.out.println("Payment Proxy is create with amount " + amount);
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public void credit() {
        System.out.println("Amount is credited " + amount);
    }

    @Override
    public void debit() {
        System.out.println("Amount is debited " + amount);
    }
}
