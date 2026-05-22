package practise.stream.questions;

import java.util.*;

public class SolveThirteen {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,5,6,8,4,6);

        List<Integer> min = list.stream().sorted().limit(3).toList();
        List<Integer> max = list.stream().sorted(Collections.reverseOrder()).limit(3).toList();
        System.out.println(min);
        System.out.println(max);
    }
}
