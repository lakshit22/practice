package practise.thread;

public class SynchronizedDemo extends Thread{
    Display d;
    String name;
    SynchronizedDemo(Display d, String name){
        this.d = d;
        this.name = name;
    }
    public void run() {
        d.wish(name);
    }

    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        SynchronizedDemo t1 = new SynchronizedDemo(d1, "Lakshit");
        SynchronizedDemo t2 = new SynchronizedDemo(d2, "Mittal");
        t1.start();
        t2.start();
    }
}
