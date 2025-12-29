package practise.java8.methodreference;

@FunctionalInterface
interface MyInstanceLambda {
    public String say();
}

public class InstanceReferencing {
    public void saySomething() {
        System.out.println("Hello, I am saying Something");
    }

    public static void main(String[] args) {
        InstanceReferencing referencing = new InstanceReferencing();
        MyStaticLambda lambda = referencing::saySomething;
        lambda.say();

        MyStaticLambda newLambda = new InstanceReferencing()::saySomething;
        newLambda.say();
    }
}
