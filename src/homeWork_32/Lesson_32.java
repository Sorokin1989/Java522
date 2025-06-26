package homeWork_32;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson_32 {
    public static void main(String[] args) throws IOException {

        //Stream Api
        //1)создание стрима из значений

//       Stream<String> stream= Stream.of("A1","A2","A3","A4","A5");
//        System.out.println(stream.collect(Collectors.toList()));
//
        //2)создание стрима из массива

//        String[] arr = {"A1", "A2", "A3", "A4", "A5"};
//        Stream<String> stream = (Arrays.stream(arr));

        //3)создание стрима из collection
//        List<String> list = new ArrayList<>();
//        list.add("a1");
//        list.add("a2");
//        list.add("a3");
//        list.add("a4");
//        list.add("a5");
//        list.add("a6");
//
//        Stream<String> stream = list.stream();
//        System.out.println(stream.collect(Collectors.toList()));

       // 4)создание стрима из file;

//        File file=new File("data.txt");
//        file.createNewFile();
//        try {
//            PrintWriter printWriter=new PrintWriter(file);
//            printWriter.println("a1");
//            printWriter.println("a2");
//            printWriter.println("a3");
//            printWriter.println("a4");
//            printWriter.println("a5");
//            printWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//try{
//    Stream<String> stream= Files.lines(Paths.get(file.getAbsolutePath()));
//    System.out.println(stream.collect(Collectors.toList()));
//} catch (IOException e) {
//    throw new RuntimeException(e);
//}
        //5)создание стрима из file;



    }
}
