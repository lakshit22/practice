package practise.lowleveldesign.behavioral.observer.pattern;

public class OrderNotificationEvent implements OrderDataObserver{
    @Override
    public void update(OrderData orderData) {
        System.out.println("Order is " + orderData.getStatus() + " having order id " + orderData.getOrderId());
    }
}
