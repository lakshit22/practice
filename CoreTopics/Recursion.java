package practise.CoreTopics;

public class Recursion {
    public void test(int a) {
        System.out.println(a);
        a++;
        if(a < 4) {
            test(a);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 1;
        Recursion recursion = new Recursion();
        recursion.test(a);
    }
}
