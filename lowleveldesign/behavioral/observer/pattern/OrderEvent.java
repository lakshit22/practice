package practise.lowleveldesign.behavioral.observer.pattern;

public class OrderEvent implements OrderDataObserver{
    @Override
    public void update(OrderData orderData) {
        System.out.println("Order no " + orderData.getOrderId() + " is in " + orderData.getStatus() + " status");
    }
}
