package practise.lowleveldesign.behavioral.observer.nativeapproach;

public class OrderNotificationEventNaive {
    private String status;
    private int orderId;

    public OrderNotificationEventNaive() {}

    public OrderNotificationEventNaive(String status, int orderId) {
        this.status = status;
        this.orderId = orderId;
    }

    public void pushNotification(String status, int orderId){
        System.out.println("Notification Pushed for " + orderId + " having " + status + " status.");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
