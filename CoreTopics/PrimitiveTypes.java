package practise.CoreTopics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimitiveTypes {
    public static void main(String[] args) {
//        long x = 10000000000L;   // use L
//        float y = 3.14f;         // use f
//        double z = 3.14;         // default decimal = double
//        int a = 100;
//
//        String s = "hello";
////        s.charAt(0);// default integer = int
//
//        byte[] str = {'L', 'a', 'k', 's', 'h', 'i', 't'};
//        String strToString = new String(str);
//        System.out.println(strToString);
        int[] nums = {1,3,1,1,2};
        long[] ans = new long[nums.length];
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            indices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for(Map.Entry<Integer, List<Integer>> entry : indices.entrySet()) {
            entry.getValue().forEach(System.out::println);
        }
    }
}
