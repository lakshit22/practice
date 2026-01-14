package practise.lowleveldesign.behavioral.observer.pattern;

public interface OrderDataSubject {
    void registerObserver(OrderDataObserver observer);
    void removeObserver(OrderDataObserver observer);
    void notifyObserver();
}
