package practise.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Student[] students = {new Student(32, 22), new Student(34, 25), new Student(33, 20), new Student(31,78)};
        List<Student> list = new ArrayList<>(Arrays.asList(students));

//        List<Student> filteredList = list.stream()
//                .filter(s -> s.getAge()>30)
//                .sorted()
//                .toList();
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.getMarks());
        }
    }
}
