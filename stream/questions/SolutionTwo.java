package practise.stream.questions;

import java.util.Arrays;
import java.util.List;

//Remove Duplicate Elements From List
public class SolutionTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,1,4);

        List<Integer> answers = list.stream().distinct().toList();
        answers.forEach(System.out::println);
    }
}
