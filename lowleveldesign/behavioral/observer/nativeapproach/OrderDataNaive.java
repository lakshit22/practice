package practise.lowleveldesign.behavioral.observer.nativeapproach;

public class OrderDataNaive {
    private OrderEventNaive orderEventNaive;
    private OrderNotificationEventNaive orderNotificationEventNaive;

    private String status;
    private int orderId;

    public OrderDataNaive(OrderEventNaive orderEventNaive, OrderNotificationEventNaive orderNotificationEventNaive) {
        this.orderEventNaive = orderEventNaive;
        this.orderNotificationEventNaive = orderNotificationEventNaive;
    }

    public void newOrderDataPushed(String status, int orderId) {
        this.status = status;
        this.orderId = orderId;

        System.out.println("New Order having order id: " + orderId + " is in " + status + " status");
        orderEventNaive.updateOrderStatus(status,orderId);
        orderNotificationEventNaive.pushNotification(status,orderId);
    }
}
