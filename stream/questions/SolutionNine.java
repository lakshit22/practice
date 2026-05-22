package practise.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SolutionNine {
    public static void main(String[] args) {
        int[] unsorted = {1,2,3,4,5};
        int[] unsortedTwo = {4,5,6,7,8};

        int[] ans = IntStream.concat(Arrays.stream(unsorted), Arrays.stream(unsortedTwo)).sorted().toArray();

        System.out.println(Arrays.toString(ans));
    }
}
