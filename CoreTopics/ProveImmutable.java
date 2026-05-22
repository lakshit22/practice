package practise.CoreTopics;

public class ProveImmutable {
    public static void main(String[] args) {
        String name = "Lakshit";
        System.out.println(name + " " + name.hashCode());
        name = name + " Mittal";
        System.out.println(name +  " " + name.hashCode());

        StringBuilder sb = new StringBuilder("Lakshit");
        System.out.println(sb.toString() + " " + sb.hashCode());
        StringBuilder sb2 = sb.append(" Mittal");
        System.out.println(sb2.toString() + " " + sb2.hashCode());  //same as of sb1
        System.out.println(sb == sb2);  //true
        System.out.println(sb.equals(sb2)); //true
    }
}
