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
        //
        //Объединение строк с разделителем
        //Дан список List<String> words = Arrays.asList("Java", "is", "awesome");
        //Объединить все слова в одну строку через пробел.
        //
        //Задания на терминальные методы
        //Проверка отсутствия отрицательных чисел
        //Дан список numbers. Использовать noneMatch, чтобы проверить, что отрицательных чисел нет.
        //
        //Поиск максимальной длины слова
        //Дан список слов. Найти длину самого длинного слова.
        //
        //Подсчет суммы всех чисел
        //Дан список чисел. Посчитать сумму всех элементов с помощью reduce.
        //
        //Подсчет количества уникальных слов
        //Дан список слов с возможными повторениями. Посчитать количество уникальных слов.
        //
        //Поиск строки, содержащей подстроку "stream"
        //Использовать filter и findFirst, чтобы найти первую строку, содержащую слово "stream".

    }
}
