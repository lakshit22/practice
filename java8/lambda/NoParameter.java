package practise.java8.lambda;

@FunctionalInterface
interface MyCustomLambda {
    public String say();
}

public class NoParameter {
    public static void main(String[] args){
        MyCustomLambda lambda = () -> {
            return "Hi, this is lambda";
        };

        System.out.print(lambda.say());
    }
}
