package practise.thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyReentrantLock {
    private final ReentrantLock lock = new ReentrantLock();

    public void doSomething() {
        lock.lock();
        try{
            for(int i = 0; i < 4; i++) {
                System.out.println("Hello From Reentrant Locking " + i + " " + lock.isLocked());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyReentrantLock r = new MyReentrantLock();
        Thread t1 = new Thread(() -> {
            System.out.println("Hello From T1");
            r.doSomething();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Hello From T2");
            r.doSomething();
        });

        t1.start();
        t2.start();

//        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//        ReentrantReadWriteLock.ReadLock
    }
}
