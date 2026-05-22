package practise.stream.questions;

import java.util.Arrays;
import java.util.List;

//Separate Odd And Even Numbers
public class SolutionOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> oddAnswer = list.stream().filter(s->s%2!=0).toList();
        List<Integer> evenAnswer = list.stream().filter(s->s%2==0).toList();

        oddAnswer.forEach(System.out::println);
        evenAnswer.forEach(System.out::println);
    }
}
