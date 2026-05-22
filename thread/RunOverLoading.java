package practise.thread;

public class RunOverLoading extends Thread{
    public void run() {
        System.out.println("No Args Method");
    }

    public void run(int i) {
        System.out.println("Int Args Method");
    }

    public static void main(String[] args) {
        RunOverLoading rol = new RunOverLoading();
        rol.start();        // new thread will be created and run will be called automatically
        rol.run(1);      // no new thread will be created, this will run just like a normal method
        rol.start();
    }
}