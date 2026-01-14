package practise.lowleveldesign.behavioral.observer.pattern;

public class OrderObserverMain {
    public static void main(String[] args) {
        OrderData orderData = new OrderData();

        OrderEvent orderEvent = new OrderEvent();
        OrderNotificationEvent orderNotificationEvent = new OrderNotificationEvent();

        orderData.registerObserver(orderEvent);
        orderData.registerObserver(orderNotificationEvent);

        orderData.newOrderDataPushed("Created",34423);
        orderData.newOrderDataPushed("Submitted", 34423);
    }
}
