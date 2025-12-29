package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SameName {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        SameName name = new SameName();
        System.out.println("Hello from other class name " + name.getClass().getName());
        System.out.println("Printing ClassLoader " + Arrays.toString(name.getClass().getClassLoader().getDefinedPackages()));
    }
}
