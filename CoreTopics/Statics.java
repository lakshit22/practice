package practise.CoreTopics;

public class Statics {
    static {
        System.out.println("SB1");
        Statics statics = new Statics();
    }

    {
        System.out.println("IB");
    }

    static {
        System.out.println("SB2");
    }

    public static void main(String[] args) {
        System.out.println("Main Calling");
    }
}
