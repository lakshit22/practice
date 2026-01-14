package practise.lowleveldesign.behavioral.observer.nativeapproach;

public class OrderClientMain {
    public static void main(String[] args) {
        OrderNotificationEventNaive orderNotificationEventNaive = new OrderNotificationEventNaive();
        OrderEventNaive orderEventNaive = new OrderEventNaive();

        OrderDataNaive orderDataNaive = new OrderDataNaive(orderEventNaive,orderNotificationEventNaive);
        orderDataNaive.newOrderDataPushed("Created",12254);
    }
}
