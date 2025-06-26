package homeWork_32;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}




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
        //5)создание стрима из строки;

//        IntStream intStream= "Dima123".chars();
//        intStream.forEach(x-> System.out.println(x));

        //6)создание стрима из builder;

//        Stream.Builder<String> builder= Stream.builder();
//        Stream<String> stream=builder.add("a1").add("a2").add("a3").add("a4").add("a5").build();
//        System.out.println(stream.collect(Collectors.toList()));
//
//
        //filter
//        List<Integer> arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);
//        arr.add(8);
//        arr.add(9);
//        arr.add(10);
//
//        List<Integer> rezult=arr.stream().filter(x->x==5).toList();
//        for (Integer num:rezult) {
//            System.out.print(num+ " ");
//        }

//        List<String> arr = new ArrayList<>();
//        arr.add("Dima");
//        arr.add("AAhv");
//        arr.add("AAnjvjir");
//        arr.add("hrthr");
//        arr.add("gjtykt");
//        arr.add("muykj");
//        arr.add("uo;lui");
//        arr.add("dafwer");
//
//        arr = (List<String>) arr.stream().filter(x -> x.contains("A")).toList();
//
//        arr.forEach(x-> System.out.print(x + " "));
//        System.out.println(arr);
//        System.out.println(arr.stream().toList());
//        for (String num : arr) {
//            System.out.print(num + " ");
//        }

//        List<Person> people=new ArrayList<>();
//        people.add(new Person("Dima",36));
//        people.add(new Person("Kola",26));
//        people.add(new Person("Farid",46));
//        people.add(new Person("Petya",86));
//        people.add(new Person("Vika",90));
//        people.add(new Person("Olga",65));
//
//        people=people.stream().filter(x->x.age<50&&x.name.contains("D")).toList();
//        System.out.println(people);

        List<Person> people=new ArrayList<>();
        people.add(new Person("Dima",36));
        people.add(new Person("Kola",26));
        people.add(new Person("Farid",46));
        people.add(new Person("Petya",86));
        people.add(new Person("Vika",90));
        people.add(new Person("Olga",65));

        people=people.stream().limit(3).toList();
        System.out.println(people);




    }
}
