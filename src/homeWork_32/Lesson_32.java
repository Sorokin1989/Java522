package homeWork_32;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson_32 {
    public static void main(String[] args) {

        //Stream Api
        //1)создание стрима из значений

//       Stream<String> stream= Stream.of("A1","A2","A3","A4","A5");
//        System.out.println(stream.collect(Collectors.toList()));
//
        //2)создание стрима из массива

//        String[] arr = {"A1", "A2", "A3", "A4", "A5"};
//        Stream<String> stream = (Arrays.stream(arr));

        //2)создание стрима из collection
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        Stream<String> stream = list.stream();
        System.out.println(stream.collect(Collectors.toList()));


    }
}
