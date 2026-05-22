package practise.stream.questions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SolutionTwelve {
    public static void main(String[] args) {
        int num = 12345;
//        int sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        int sumTwo = Stream.of(String
                .valueOf(num)
                .split(""))
                .map(s -> Integer.parseInt(s))
                .reduce(0, Integer::sum);
        System.out.println(sumTwo);
    }
}
