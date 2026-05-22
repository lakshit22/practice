package practise.thread;

public class StartOverRiding extends Thread{
    public void start() {
        System.out.println("Start Method");
    }
    public void run() {
        System.out.println("Run Method");
    }

    public static void main(String[] args) {
        StartOverRiding sor = new StartOverRiding();
        sor.start();        // no new thread will be create, will not call run()
    }
}
