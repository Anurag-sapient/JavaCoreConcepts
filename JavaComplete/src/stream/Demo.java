package stream;

import stream.data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static List<Student> getData(){
        Student s1=new Student("Adam",2,3,"male",Arrays.asList("swimming","basketball"));

        Student s2=new Student("Dave",4,4,"male",Arrays.asList("swimming","dance"));
        Student s3=new Student("Emily",3,1,"female",Arrays.asList("dance","basketball"));
        Student s4=new Student("Eve",1,2,"female",Arrays.asList("swimming","cricket"));
        Student s5=new Student("Sophia",3,3,"female",Arrays.asList("football","basketball"));

        Student s6=new Student("James",4,4,"male",Arrays.asList("cricket","basketball"));
        return Arrays.asList(s1,s2,s3,s4,s5,s6);
    }
    public static void main(String[] args) {
        List<Integer>l= Arrays.asList(1,2,3,10,12,17);
        l.stream().forEach(i-> System.out.println(i));
        l.stream().forEach(i-> System.out.println(i));
        Optional<Student> s=getData().stream()
                 .reduce((s1,s2)->{
                         if(s1.getGpa()> s2.getGpa())return s1;
                         else return s2;
                 });

        System.out.println(s.get());

    }

}
//stream-filter/sort/map-collect
//converts collection to stream-- using .stream()-Stream<Type>
//converts back to collections using .collect(Collection.toList)
//map converts - from one type to another
//Stream<List<String>>->List<String> flatMap converts after map to list of string list to string list
//.distinct will filter distinct only
//.sorted to perform sorting or .sorted(Comparator.comparing(Student::getName));
//.filter gives true if condition satisifies
//count -gives count only instead of using .Collectors(collect.toList())
//Reducer -returns one output - which can be anything but stored inside Optional<>
//match anymatch or findfirst or findany and limit
