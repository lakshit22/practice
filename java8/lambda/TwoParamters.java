package practise.java8.lambda;

@FunctionalInterface
interface TwoParamLambda {
    public String say(String p1, String p2);
}
public class TwoParamters {
    public static void main(String[] args) {
        TwoParamLambda lambda = (firstname, lastname) -> "My Full name is " + firstname + " " + lastname;
        System.out.println(lambda.say("Lakshit", "Mittal"));
    }
}
