package TestLessons;

import java.util.*;
import java.util.stream.Collectors;

public class LessonTest {
    public static void main(String[] args) {
        //Фильтрация и преобразование:
        //
        //Дан список List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        //Оставить только четные числа и преобразовать их в строки вида "Четное: <число>".

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).map(x -> "Четное " + x).collect(Collectors.toList()));


        //Объединение строк:
        //
        //Есть список List<String> words = Arrays.asList("яблоко", "банан", "киви");
        //Объединить все слова в одну строку через запятую и пробел: "яблоко, банан, киви".

        List<String> words = Arrays.asList("яблоко", "банан", "киви");
        System.out.println(words.stream().collect(Collectors.joining(", ")));


        //Подсчет суммы:
        //
        //Есть список List<Integer> nums = Arrays.asList(10, 20, 30);
        //Посчитать сумму всех чисел с помощью стримов.

        List<Integer> nums = Arrays.asList(10, 20, 30);
        System.out.println(nums.stream().reduce((x,y)->x+y).orElse(0));



        //Поиск максимума:
        //
        //В списке List<Integer> values = Arrays.asList(5, 17, 3, 9);
        //Найти максимальное число.
        List<Integer> values = Arrays.asList(5, 17, 3, 9);

        System.out.println(values.stream().max((x,y)->x.compareTo(y)).orElse(0));


        //Группировка по условию:
        //
        //Есть список List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        //Разделить числа на две группы: четные и нечетные. Создать карту Map<Boolean, List<Integer>>, где ключ — true для четных чисел.
        //Преобразование и фильтрация строк:
        //
        //Есть список List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        //Оставить только слова длиной больше 5 символов и преобразовать их в верхний регистр.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

        System.out.println(fruits.stream().filter(x->x.length()>5).map(String::toUpperCase).toList());



        //Подсчет количества элементов по условию:
        //
        //В списке List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        //Подсчитать количество чисел больше 2.

        List<Integer> numss = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(numss.stream().filter(x->x>2).count());



        //Создание списка уникальных элементов:
        //
        //Есть список List<String> items = Arrays.asList("a", "b", "a", "c", "b");
        //Получить список уникальных элементов.
        List<String> items = Arrays.asList("a", "b", "a", "c", "b");
        System.out.println(items.stream().distinct().toList());

        //Преобразование списка объектов:
        //
        //Есть класс Person с полями name и age.
        //Создать список persons, затем получить список имен людей старше 18 лет.

        List<Person> persons=new ArrayList<>();

        persons.add(new Person("Dima",36));
        persons.add(new Person("Dima",16));
        persons.add(new Person("Dima",13));
        persons.add(new Person("Dima",12));
        persons.add(new Person("Dima",17));
        persons.add(new Person("Dima",45));
        persons.add(new Person("Dima",34));

      List<Person> people=persons.stream().filter(x->x.age>18).toList();
        System.out.println(people);




        //Сортировка списка:
        //
        //Есть список List<Integer> nums = Arrays.asList(5, 2, 9, 1);
        //Отсортировать его по возрастанию и вывести результат.

        List<Integer> numsw = Arrays.asList(5, 2, 9, 1);
        System.out.println(numsw.stream().sorted().toList());



    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= " + name  + " age=" + age;
    }
}