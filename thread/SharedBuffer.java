package practise.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBuffer {

    private int data;
    private boolean available = false;

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    // Producer method
    public void produce(int value) throws InterruptedException {
        lock.lock();
        try {
            while (available) {
                condition.await(); // wait until consumed
            }

            data = value;
            available = true;
            System.out.println("Produced: " + value);

            condition.signal(); // wake consumer

        } finally {
            lock.unlock();
        }
    }

    // Consumer method
    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (!available) {
                condition.await(); // wait until produced
            }

            System.out.println("Consumed: " + data);
            available = false;

            condition.signal(); // wake producer

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
