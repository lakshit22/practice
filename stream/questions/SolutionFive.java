package practise.stream.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionFive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> ans = list.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(ans);
    }
}
