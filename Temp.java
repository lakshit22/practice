package practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Temp {
    public static void main(String[] args) {
//        IntStream.range(1, 5)
//                .map(n -> {
//                    System.out.println("Mapping: " + n);
//                    return n * 2;
//                }).forEach(System.out::println);
//        int[] arr = new int[] {2,5,4,2,3,1};
//        Arrays.stream(arr)
//                .boxed()
//                .sorted((a,b) -> b-a)
//                .mapToInt(Integer::intValue)
//                .forEach(System.out::println);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int ans = list.parallelStream().reduce(5,Integer::sum);
        System.out.println(ans);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

