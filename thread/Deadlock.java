package practise.thread;

public class Deadlock {
    public static void main(String[] args) {
        final String resource_one = "Lakshit";
        final String resource_two = "Rishabh";

        Thread thread_one = new Thread() {
            @Override
            public void run() {
                synchronized (resource_one) {
                    System.out.println("Thread One Locked Resourse One");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e) {}
                    synchronized (resource_two) {
                        System.out.println("Thread One Locked Resource Two");
                    }
                }
            }
        };

        Thread thread_two = new Thread() {
            @Override
            public void run() {
                synchronized (resource_two) {
                    System.out.println("Thread Two Locked Resource Two");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e) {}
                    synchronized (resource_one) {
                        System.out.println("Thread Two Locked Resource One");
                    }
                }
            }
        };
        thread_one.start();
        thread_two.start();
    }
}
