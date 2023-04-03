package stream;

import stream.data.Student;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        List<String> studentList=Demo.getData().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        Set<String> studentSet=Demo.getData().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(studentList);
        System.out.println(studentSet);
    }
}
