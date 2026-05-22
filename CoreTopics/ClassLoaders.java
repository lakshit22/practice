package practise.CoreTopics;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;

public class ClassLoaders {
    public static void main(String[] args) {
        System.out.println("Platform Classloader:"
                + ClassLoader.getPlatformClassLoader());

        System.out.println("System Classloader:"
                + ClassLoader.getSystemClassLoader());

        System.out.println("Classloader of this class:"
                + ClassLoaders.class.getClassLoader());

        System.out.println("Classloader of DriverManager:"
                + DriverManager.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }
}
