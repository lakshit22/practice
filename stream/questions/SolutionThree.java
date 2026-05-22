package practise.stream.questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Frequency Of Each Character In String
public class SolutionThree {
    public static void main(String[] args) {
        String str = "Rishabh";

        Map<String, Long> ans = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Character, Long> ansTwo = str.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Object[] ansThree = str.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().toArray();

        System.out.println(Arrays.toString(ansThree));
    }
}
