package practise.thread;

public class Display {
    public void wish(String name) {
        for(int i = 0; i < 2; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println(name);
        }
    }
}
