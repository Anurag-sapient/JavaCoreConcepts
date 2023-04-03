package stream;

import stream.data.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static void main(String[] args) {
        List<String>flatMap=Demo.getData().stream()
                .map(Student::getActivites)
                .flatMap(List::stream)
                .distinct() //this makes distinct
//              .count() this will give count
                .collect(Collectors.toList());
        System.out.println(flatMap);
    }
}
