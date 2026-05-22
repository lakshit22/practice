package practise.thread;

public class ThreadMain {
    public static class MyThread {
        public void doSomething(){
            System.out.println("Doing Something");
        }
    }
    public static void main(String[] args) {
//        Step 1: one shared lock object
        MyThread lock = new MyThread();

//        Step 2: two real threads
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting...");
                    lock.wait();
                    System.out.println("Resumed...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread workingThread = new Thread(() -> {
            synchronized (lock) {
                lock.doSomething();
                lock.notify();
            }
        });
        waitingThread.start();
        workingThread.start();

    }
}
