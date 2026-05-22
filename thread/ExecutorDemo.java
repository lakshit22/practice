package practise.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = {
                new PrintJob("Durga"),
                new PrintJob("Ravi"),
                new PrintJob("Nagendra"),
                new PrintJob("Pavan"),
                new PrintJob("Bhaskar"),
                new PrintJob("Varma")
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
