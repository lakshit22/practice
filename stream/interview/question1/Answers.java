package practise.stream.interview.question1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Answers {
    public static Map<String, Employee> getTopEarners(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
    }

    public static Map<String, Double> getAvgSalary(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }

    public static List<Employee> joinedSalary(List<Employee> employees, int years) {
        int year = LocalDate.now().getYear() - years;
        System.out.println(year);
        return employees.stream().filter(s -> s.getJoiningDate().getYear() > year)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
    }
}
