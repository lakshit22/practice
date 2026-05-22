package practise.thread;

public class SimpleThread {
    public static void main(String[] args) {
//        Thread thread = new Thread("Lakshit");
//        thread.run();
//        System.out.println(thread.getName());

        CustomThread thread = new CustomThread();
        thread.run();
    }
}
