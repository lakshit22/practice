package practise.thread;

public class YieldFunction extends Thread{
    public void run() {
        for(int i = 0; i < 5; i++) {
            Thread.yield();
//            System.out.println("Child Thread");
            System.out.println(Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        YieldFunction yf = new YieldFunction();
        yf.start();
        for(int i = 0; i < 5; i++) {
//            System.out.println("Main Thread");
            System.out.println(Thread.currentThread());
        }
    }
}
