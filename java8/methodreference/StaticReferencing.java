package practise.java8.methodreference;

@FunctionalInterface
interface MyStaticLambda {
    public void say();
}

public class StaticReferencing {
    public static void saySomething() {
        System.out.println("Hello, I am saying something.");
    }

    public static void main(String[] args) {
        MyStaticLambda lambda = StaticReferencing::saySomething;
        lambda.say();
    }
}
