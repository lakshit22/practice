package practise.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingleton {
    public static void main(String[] args){
//        Constructor<LazySingleton> constructor;
//        LazySingleton lazy2;
//        try {
//            constructor = LazySingleton.class.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            lazy2 = constructor.newInstance();
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
//        LazySingleton lazy1 = LazySingleton.getInstance();
//        System.out.println(lazy1==lazy2);

//        LazySingleton lazy1 = LazySingleton.getInstance();
//        ObjectOutputStream out;
//        ObjectInputStream in;
//        LazySingleton lazy2;
//        try{
//            out = new ObjectOutputStream(new FileOutputStream("LazySingleton.data"));
//            out.writeObject(lazy1);
//
//            in = new ObjectInputStream(new FileInputStream("LazySingleton.data"));
//            lazy2 = (LazySingleton) in.readObject();
//
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(lazy1 == lazy2);

//        LazySingleton s1 = LazySingleton.getInstance();
//        LazySingleton s2 = (LazySingleton) s1.clone();
//
//        System.out.println(s1 == s2); // false

    }
}
