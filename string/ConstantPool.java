package practise.string;

public class ConstantPool {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();
        String s4 = "hello";

        System.out.println(s1==s2);     //false
        System.out.println(s2==s4);     //true
        System.out.println(s2==s3);     //true
        System.out.println(s1==s3);     //true

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");

    }
}
