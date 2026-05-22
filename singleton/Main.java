package practise.singleton;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(DoubleCheckedLockingSingleton.getInstance().hashCode());
        });

        Thread t2 = new Thread(() -> {
            System.out.println(DoubleCheckedLockingSingleton.getInstance().hashCode());
        });

        Thread t3 = new Thread(() -> {
            System.out.println(DoubleCheckedLockingSingleton.getInstance().hashCode());
        });

        Thread t4 = new Thread(() -> {
            System.out.println(DoubleCheckedLockingSingleton.getInstance().hashCode());
        });

        Thread t5 = new Thread(() -> {
            System.out.println(DoubleCheckedLockingSingleton.getInstance().hashCode());
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
