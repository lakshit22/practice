package practise.stream.interview.question1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AnswersMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Lakshit", "Engineering", 75000, LocalDate.of(2019,05,22)),
                new Employee("Rishabh", "Engineering", 65000, LocalDate.of(2022,05,22)),
                new Employee("Raj", "HR", 50000, LocalDate.of(2022,05,22))
        );

        Map<String, Employee> map = Answers.getTopEarners(employees);
        Map<String, Double> avg = Answers.getAvgSalary(employees);
        List<Employee> list = Answers.joinedSalary(employees, 5);

        System.out.println(list);
        System.out.println(avg);
        for(Map.Entry<String, Employee> entry : map.entrySet()) {
            System.out.println(entry.getValue().getDepartment() + " " + entry.getValue().getSalary());
        }
    }
}
