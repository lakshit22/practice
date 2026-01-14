package practise.customhashmap;

public class CustomHashMapMain {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("apple", 30);

        System.out.println(map.get("apple"));   // 30
        System.out.println(map.get("banana"));  // 20
        System.out.println(map.size());         // 2

        map.remove("apple");
        System.out.println(map.get("apple"));   // null
        System.out.println(map.size());          // 1
    }
}
