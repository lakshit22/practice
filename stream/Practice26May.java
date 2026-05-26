package practise.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice26May {
    public static void main(String[] args) {
//        Calculate average of integers using streams
//        List<Integer> avgList = Arrays.asList(1,2,3,4,5);
//        int average = avgList.stream().reduce(0, Integer::sum)/avgList.size();
//        double avg = avgList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//        System.out.println(avg);
//        System.out.println(average);

//        Convert strings to upper/lowercase using streams
//        List<String> strings = Arrays.asList("Lakshit", "Mittal");
//        List<String> upperCase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
//        List<String> lowerCase = strings.stream().map(String::toLowerCase).toList();
//        System.out.println(upperCase);
//        System.out.println(lowerCase);

//        Sum even and odd numbers in list using streams
//        List<Integer> sumList = Arrays.asList(1,2,3,4,5,6);
//        int evenSum = sumList.stream()
//                .filter(s -> s%2 == 0)
//                .reduce(Integer::sum)
//                .orElse(0);
//
//        int oddSum = sumList.stream()
//                .filter(s -> s%2 != 0)
//                .reduce(Integer::sum)
//                .orElse(0);
//
//        int odd = sumList.stream()
//                .filter(s -> s%2!=0)
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        System.out.println(evenSum);
//        System.out.println(oddSum);

//        Remove duplicates from list using streams
//        List<Integer> duplicateList = Arrays.asList(1,2,3,3,4,1,5);
//        List<Integer> distinctList = duplicateList.stream()
//                .distinct()
//                .collect(Collectors.toList());
//                .toList();

//        distinctList.add(10);
//        distinctList.remove(2);
//        distinctList.set(2,8);
//        System.out.println(distinctList);

//        Count strings starting with letter using streams
//        List<String> countStrings = Arrays.asList("Lakshit", "Mittal", "Is", "Lucky");
//        char character = 'L';
//        long count = countStrings.stream()
//                .filter(s -> s.charAt(0) == character)
//                .filter(s -> s.startsWith(String.valueOf(character)))
//                .count();
//        System.out.println(count);

//        Sort strings A-Z and Z-A using streams
//        List<String> sortStrings = Arrays.asList("Lakshit","Lakshis");
//        List<String> sortedString = sortStrings.stream().sorted().toList();
//        System.out.println(sortedString);

//        Find max and min in list using streams
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        int min = list.stream().min(Integer::compare).get();
//        int max = list.stream().max(Integer::compare).get();
//        System.out.println(min);
//        System.out.println(max);

//        Find 2nd smallest/largest using streams
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        int secondSmallest = list.stream().sorted().skip(1).findFirst().orElse(0);
//        int secondLargest = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0);
//        System.out.println(secondSmallest);
//        System.out.println(secondLargest);
    }
}
