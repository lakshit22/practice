package practise.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton doing work");
    }
}
