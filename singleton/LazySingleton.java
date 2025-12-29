package practise.singleton;

import java.io.Serializable;

public class LazySingleton implements Cloneable {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public LazySingleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
