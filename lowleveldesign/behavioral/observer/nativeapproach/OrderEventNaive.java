package practise.lowleveldesign.behavioral.observer.nativeapproach;

public class OrderEventNaive {
    private String status;
    private int orderId;

    public OrderEventNaive() {}
    public OrderEventNaive(String status, int orderId) {
        this.status = status;
        this.orderId = orderId;
    }

    public void updateOrderStatus(String status, int orderId) {
        System.out.println("Order no " + orderId + " is in " + status + " status");
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
