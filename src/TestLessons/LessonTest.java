package TestLessons;

import java.util.*;
import java.util.stream.Collectors;

public class LessonTest {
    public static void main(String[] args) {


        //Фильтрация по начальной букве
        //Дан список List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");
        //Отфильтровать имена, начинающиеся на букву 'A'.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        System.out.println(names.stream().filter(x->x.startsWith("A")).toList());

        //
        //Преобразование строк в верхний регистр
        //Дан список List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        //Создать новый список, где все слова будут в верхнем регистре.

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        System.out.println(fruits.stream().map(x->x.toUpperCase()).toList());

        //Обратная сортировка по алфавиту
        //Отсортировать список names по убыванию алфавита.
        System.out.println(names.stream().sorted(Comparator.reverseOrder()).toList());

        //
        //Фильтрация и преобразование чисел
        //Дан список List<Integer> nums = Arrays.asList(3, 7, 2, 9, 4);
        //Оставить только четные числа и умножить их на 10.

        List<Integer> nums = Arrays.asList(3, 7, 2, 9, 4);

        System.out.println(nums.stream().filter(x->x%2==0).map(x->x*10).toList());


        //
        //Объединение строк с разделителем
        //Дан список List<String> words = Arrays.asList("Java", "is", "awesome");
        //Объединить все слова в одну строку через пробел.

        List<String> words = Arrays.asList("stream", "Java", "is", "awesome","Java", "is", "awesome");

        System.out.println(words.stream().collect(Collectors.joining(" ")));


        //
        //Задания на терминальные методы
        //Проверка отсутствия отрицательных чисел
        //Дан список numbers. Использовать noneMatch, чтобы проверить, что отрицательных чисел нет.


        List<Integer> numbers=new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(10);
        numbers.add(14);
        numbers.add(134);

        System.out.println(numbers.stream().noneMatch(x->x<0));

        //
        //Поиск максимальной длины слова
        //Дан список слов. Найти длину самого длинного слова.

        System.out.println(words.stream().max((x,y)->x.length()-y.length()).orElse(String.valueOf(0)));

        //
        //Подсчет суммы всех чисел
        //Дан список чисел. Посчитать сумму всех элементов с помощью reduce.

        System.out.println(numbers.stream().reduce(Integer::sum).orElse(0));



        //
        //Подсчет количества уникальных слов
        //Дан список слов с возможными повторениями. Посчитать количество уникальных слов.
        System.out.println(words.stream().distinct().count());

        //
        //Поиск строки, содержащей подстроку "stream"
        //Использовать filter и findFirst, чтобы найти первую строку, содержащую слово "stream".


        System.out.println(words.stream().filter(x->x.contains("stream")).findFirst().orElse(null));



    }
}
