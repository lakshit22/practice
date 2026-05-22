package practise.thread;

public class SynchronizedReentrant {
    synchronized void methodA() {
        System.out.println("MethodA" + Thread.currentThread());
        methodB();
    }

    synchronized void methodB() {
        System.out.println("MethodB" + Thread.currentThread());
    }

    public static void main(String[] args) {
        SynchronizedReentrant r = new SynchronizedReentrant();
        r.methodA();
    }
}
