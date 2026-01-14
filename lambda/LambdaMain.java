package practise.lambda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LambdaMain {
    public static void main(String[] args) {
//        IntegerCustomFunctional integerCustomFunctionalTypee1 = (a, b) -> {
//            return a+b;
//        };
//
//        IntegerCustomFunctional integerCustomFunctionalType2 = (a, b) -> a+b;

//        BooleanIntegerFunctional booleanIntegerFunctional = (a,b) -> a.equals(b);

//        Filter even and odd numbers with lambda
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,1));
//        list.stream().filter(s -> s%2 == 0).forEach(System.out::println);

//        Sort strings alphabetically using lambda
//        List<String> list = new ArrayList<>(Arrays.asList("Mittal","Lakshit"));
//        list.stream().sorted(String::compareTo).forEach(System.out::println);

//        Find average of doubles using lambda
//        List<Double> list = new ArrayList<>(Arrays.asList(1.0,2.0,3.15,4.23,5.4));
//        System.out.println(list.stream().mapToDouble(Double::doubleValue).average().orElse(0));

//        Remove integer duplicates using lambda
//        list.stream().distinct().forEach(System.out::println);
//        list.stream().map(Integer::longValue).forEach(System.out::println);

//        Calculate factorial using lambda expression
//        Function<Integer,Integer> function = (n) -> {
//            int ans = 1;
//            for(int i = n; i > 0; i--){
//                ans = ans*i;
//            }
//            return ans;
//        };
//        System.out.println(function.apply(5));
//        System.out.println(IntStream.rangeClosed(1,5).asLongStream().reduce(1,(a,b) -> a*b));

//        Check if number is prime using lambda
//        Predicate<Integer> predicate = (n) -> {
//            for (int i = 2; i < n / 2; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        };
//        System.out.println(predicate.test(7));
//        Function<Integer, Boolean> function = n -> IntStream.rangeClosed(2,n/2).noneMatch(i -> n%i == 0);
//        System.out.println(function.apply(50));

//        Find max and min in list using lambda
//        System.out.println(list.stream().min(Comparator.comparing(Integer::intValue)).orElse(0));
//        System.out.println(list.stream().max(Comparator.comparing(Integer::intValue)).orElse(0));

//        Multiply and sum list elements using lambda
//        System.out.println(list.stream().reduce(1,(a,b) -> a*b).intValue());
//        System.out.println(list.stream().reduce(1, Integer::sum).intValue());

//        Count words in sentence with lambda
//        String str = "Lakshit Mittal is like a good boy";
//        System.out.println(Arrays.stream(str.split(" ")).count());

//        Arrays.stream(str.split(" ")).sorted((str1, str2) -> str2.length()-str1.length()).forEach(System.out::println);

//        String str = "4321 1234 456 4568";
//        Arrays.stream(str.split(" ")).map(Integer::valueOf).sorted().forEach(System.out::println);

//        Check if string is palindrome using lambda
//        String str = "nitin";
//        System.out.println(new StringBuilder(str).reverse().toString().equals(str));
//        Find 2nd largest/smallest in array using lambda
        Integer[] arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));
    }
}
