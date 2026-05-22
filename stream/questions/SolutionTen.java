package practise.stream.questions;

import java.util.stream.Collectors;

public class SolutionTen {
    public static void main(String[] args) {
        String strOne = "listen";
        String strTwo = "silent";

        Boolean ans =
                strOne.chars()
                        .sorted()
                        .boxed()
                        .collect(Collectors.toList())
                        .equals(
                                strTwo.chars()
                                        .sorted()
                                        .boxed()
                                        .collect(Collectors.toList())
                        );


        System.out.println(ans);
    }
}
