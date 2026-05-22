package practise.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionSix {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Lakshit", "Mittal");
        String delimiter = ",";
        String str = strings.stream().collect(Collectors.joining(delimiter, "[", "]")).toString();
        System.out.println(str);
    }
}
