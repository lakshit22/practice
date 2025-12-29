package practise.java8.lambda;

@FunctionalInterface
interface SingleParamLambda {
    public String say(String p1);
}
public class SingleParameter {
    public static void main(String[] args) {
        SingleParamLambda lambda = (name) -> {
            return "I am " + name;
        };

        System.out.println(lambda.say("Lakshit"));
    }
}
