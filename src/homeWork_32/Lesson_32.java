package homeWork_32;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson_32 {
    public static void main(String[] args) {

        //Stream Api
        //создание стрима из значений

       Stream<String> stream= Stream.of("A1","A2","A3","A4","A5");

        System.out.println(stream.collect(Collectors.toList()));


    }
}
