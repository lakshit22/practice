package practise.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {}

    public static class Helper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Helper.instance;
    }
}
