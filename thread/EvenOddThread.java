package practise.thread;

public class EvenOddThread {
    private static final int number = 500;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            for(int i = 1; i < number; i++){
                synchronized (lock) {
                if(i%2 == 0){
                        System.out.println("Even " + i);
                        lock.notifyAll();
                }else{
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
}
        });
        Thread oddThread = new Thread(() -> {
            for(int i = 1; i<number; i++) {
                synchronized (lock) {
                    if (i % 2 != 0) {
                        System.out.println("Odd " + i);
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
