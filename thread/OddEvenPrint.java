package practise.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class OddEvenPrint {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);


        // Waiting thread
        new Thread(() -> {
            try {
                System.out.println("Waiting...");
                latch.await();      // blocks
                System.out.println("Work done, continuing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        // Working thread
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Doing work");
                latch.countDown(); // releases waiting thread
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
//    }

//        int num = 10;
//        AtomicBoolean working = new AtomicBoolean(false);
//        Object lock = new Object();
//        Thread oddThread = new Thread(() -> {
//            for(int i = 1; i < 10; i++){
//                while(!working.get()){
//                    synchronized (lock) {
//                        if (i % 2 != 0) {
//                            working.set(true);
//                            lock.notify();
//                            System.out.println("Odd Thread " + i);
//                        } else {
//                            try {
//                                lock.wait();
//                            } catch (InterruptedException e) {
//                                throw new RuntimeException(e);
//                            }
//                        }
//                    }
//                    working.set(false);
//                }
//            }
//        });
//
//        Thread evenThread = new Thread(() -> {
//            for(int i = 2; i <= 10; i++){
//                while(!working.get()){
//                    synchronized (lock){
//                        if(i%2 == 0){
//                            working.set(true);
//                            System.out.println("Even Thread " + i);
//                            lock.notify();
//                        }else {
//                            try {
//                                lock.wait();
//                            } catch (InterruptedException e) {
//                                throw new RuntimeException(e);
//                            }
//                        }
//                    }
//                    working.set(false);
//                }
//            }
//        });
//        oddThread.start();
//        evenThread.start();
    }
}
