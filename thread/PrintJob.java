package practise.thread;

public class PrintJob implements Runnable{
    String name;
    PrintJob(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + " Job Started By Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Job Completed By Thread: " + Thread.currentThread().getName());
    }
}
