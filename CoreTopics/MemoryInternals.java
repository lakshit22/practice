package practise.CoreTopics;

public class MemoryInternals {
    public static void main(String[] args) {
        byte[] arr = new byte[3];
        arr[0] = 10;
        arr[1] = ' ';
        arr[2] = -20;

        for(byte ar : arr) {
            System.out.println(ar);
        }
    }
}
