package practise.collection.List.arraylist;

import java.util.ArrayList;

public class CustomList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Before resizing
        System.out.println(System.identityHashCode(list.toArray()));

        list.add(5);
        list.add(6);
        // After adding more elements (might trigger resize)
        System.out.println(System.identityHashCode(list.toArray()));

        list.add(7);
        list.add(8);
        System.out.println(System.identityHashCode(list.toArray()));

        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(System.identityHashCode(list.toArray()));
    }
}
