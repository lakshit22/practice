package practise.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetImpl {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add(null);
//        set.add(null);  //  will not throw an error, will just ignore it
        set.add("one");
//        set.add("One"); //  will not throw an error, will just ignore it
//        set.remove("One");
        Iterator<String> itr = set.iterator();

//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add(null);
        list.add(null);
        list.add("one");

        HashSet<String> listSet = new HashSet<>(list);
        for(String s : set){
            System.out.println(s);
        }
    }

}
