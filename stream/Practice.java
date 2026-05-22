package practise.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        String[] str = {"lakshit", "mittal", "is", "c", "b"};
        // comparing length of strings
        String longest = Arrays.stream(str).max(Comparator.comparingInt(String::length).reversed()).orElse("");
        // comparing alphabets of strings
        String charLongest = Arrays.stream(str).distinct().sorted().findFirst().orElse("");
        System.out.println(longest);
        System.out.println(charLongest);

        String palin = "nitin";
        System.out.println(new StringBuilder(palin).compareTo((new StringBuilder(palin).reverse())) == 0);

        String sentence = "Lakshit is a good Boy";
        int count = Arrays.stream(sentence.split("\\s+")).toList().size();
        System.out.println(count);
    }
}
