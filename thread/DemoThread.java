package practise.thread;

public class DemoThread {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();  // new thread will be created which will execute the run() method
        r.run();    // No new Thread will be created and MyRunnable class run() method will be executed just like a normal method call

        for(int i = 0; i < 2; i++) {
            System.out.println("Main Thread");
        }
    }
}

