package practise;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Main {
    static Integer b = 10;
    public static void main(String[] args){
//        User objectOne = new User("lakshit",18);
//        User objectTwo = objectOne.clone();
//        System.out.println(objectOne.toString());
//        System.out.println(objectOne.getClass().getName() + '@' + Integer.toHexString(objectOne.
//                hashCode()));
//        System.out.println(objectTwo.toString());

//        Integer a = new Integer(5); //usage of Integer(5) is deprecated after Java 9
//        int b = a.intValue();  // after java 5, we don't need .intValue() to change value explicitly
//        int c = a; // after java 5, unboxing will done this automatically.
//        System.out.println(a + " " + b + " " + c);

//        String str1 = "Unicode Sytem\u00A9";
//        byte[] charset = null;
//        String newstr;
//        try {
//            charset = str1.getBytes("UTF-8");
//            newstr = new String(charset, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(newstr);
//        Integer a = 20;
//        Main.b = a;
//        System.out.println(b.equals(a));
        ArrayList<Integer> list = new ArrayList<>();
        ConstructorCalling cons = new ConstructorCalling("lakshit");
    }
}
