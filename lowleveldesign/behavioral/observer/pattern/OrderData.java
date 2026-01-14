package practise.lowleveldesign.behavioral.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class OrderData implements OrderDataSubject{
    private String status;
    private int orderId;

    private final List<OrderDataObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(OrderDataObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderDataObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(OrderDataObserver observer : observers) {
            observer.update(this);
        }
    }

    public void newOrderDataPushed(String status, int orderId) {
        this.status = status;
        this.orderId = orderId;

        System.out.println("New Order having order id: " + orderId + " is in " + status + " status");
        notifyObserver();
    }

    public String getStatus() {
        return status;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<OrderDataObserver> getObservers() {
        return observers;
    }
}
