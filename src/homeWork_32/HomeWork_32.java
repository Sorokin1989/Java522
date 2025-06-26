package homeWork_32;

import java.util.Arrays;
import java.util.List;

public class HomeWork_32 {
    public static void main(String[] args) {
//Задания на конвейерные методы (промежуточные):
//1)Фильтрация чисел
//Дан список List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40).
//Отфильтруй только те числа, которые делятся на 5, но не делятся на 10.
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        numbers = numbers.stream().filter(x -> x % 5 == 0 && x % 10 != 0).toList();
        System.out.println(numbers);


//
//2)Маппинг строк в длину
//Дан список List<String> cities = Arrays.asList("Baku", "London", "New York", "Berlin").
//Получи List<Integer> с длинами всех городов.
//
        List<String> cities = Arrays.asList("Baku", "London", "New York", "Berlin");
       // List<Integer> list=cities.stream().map(x->x.length()).toList();
        List<Integer> list=cities.stream().mapToInt(x->x.length()).boxed().toList();
        System.out.println(list);

//3)Сортировка по длине строки
//Отсортируй cities по возрастанию длины названия.

       cities= cities.stream().sorted((x,y)->x.length()-y.length()).toList();
        System.out.println(cities);


//
//4)Переименование файлов
//Дана коллекция List<String> files = Arrays.asList("photo.jpg", "doc.txt", "archive.zip").
//Добавь префикс "backup_" ко всем названиям файлов.
//
//5)Объединение слов
//Есть List<String> phrases = Arrays.asList("Java is", "fun to", "learn and", "use!").
//Раздели все фразы на отдельные слова с помощью flatMap.
//
//Задания на терминальные методы:
//6)Проверка наличия большого числа
//Дан список List<Integer> numbers.
//Используй anyMatch, чтобы проверить, есть ли число больше 1000.
//
//7)Поиск самого короткого слова
//Дан список слов. Найди слово с минимальной длиной с помощью min.
//
//8)Сумма чётных чисел
//Дан список чисел. Найди сумму только чётных чисел с помощью reduce.
//
//9)Подсчёт слов длиной > 5
//Дан список слов. Посчитай, сколько слов имеют длину больше 5 с помощью count.
//
//10)Найди первую строку, начинающуюся с буквы 'A'
//Используй findFirst для поиска строки, начинающейся на "A" из списка строк.
    }
}
