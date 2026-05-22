package practise.stream.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionSeven {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,3,5,8,10,12,15);

        list.stream().filter(s -> s%5==0).forEach(System.out::println);

        Integer a = list.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(a);

        Integer b = list.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(b);
    }
}
