package homeWork_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        List<Integer> list = cities.stream().mapToInt(x -> x.length()).boxed().toList();
        System.out.println(list);

//3)Сортировка по длине строки
//Отсортируй cities по возрастанию длины названия.

        cities = cities.stream().sorted((x, y) -> x.length() - y.length()).toList();
        System.out.println(cities);


//
//4)Переименование файлов
//Дана коллекция List<String> files = Arrays.asList("photo.jpg", "doc.txt", "archive.zip").
//Добавь префикс "backup_" ко всем названиям файлов.
        List<String> files = Arrays.asList("photo.jpg", "doc.txt", "archive.zip");

        files = files.stream().map(x -> "backup_" + x).toList();
        System.out.println(files);


//
//5)Объединение слов
//Есть List<String> phrases = Arrays.asList("Java is", "fun to", "learn and", "use!").
//Раздели все фразы на отдельные слова с помощью flatMap.
        List<String> phrases = Arrays.asList("Java is", "fun to", "learn and", "use!");
        phrases = phrases.stream().flatMap(x -> Arrays.stream(x.split(" "))).toList();
        System.out.println(phrases);


//
//Задания на терминальные методы:
//6)Проверка наличия большого числа
//Дан список List<Integer> numbers.
//Используй anyMatch, чтобы проверить, есть ли число больше 1000.
        List<Integer> numberss = new ArrayList<>();
        numberss.add(1000);
        numberss.add(100);
        numberss.add(10000);
        numberss.add(1300);
        numberss.add(1100);
        numberss.add(1560);
        numberss.add(1580);
        numberss.add(45);

        System.out.println(numberss.stream().anyMatch(x -> x > 1000));

//
//7)Поиск самого короткого слова
//Дан список слов. Найди слово с минимальной длиной с помощью min.

        List<String> stringList = new ArrayList<>();
        stringList.add("Dima");
        stringList.add("Nikolai");
        stringList.add("Roman");
        stringList.add("Evgenii");
        stringList.add("Ola");

        System.out.println(stringList.stream().min((x, y) -> x.length() - y.length()));
        System.out.println(stringList.stream().min(Comparator.comparingInt(String::length)).orElse("Список пустой"));


//
//8)Сумма чётных чисел
//Дан список чисел. Найди сумму только чётных чисел с помощью reduce.


        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(23);
        integerList.add(35);
        integerList.add(46);
        integerList.add(54);
        integerList.add(12);
        integerList.add(88);
        integerList.add(35);
        integerList.add(77);
        integerList.add(56);

        System.out.println(integerList.stream().filter(x->x%2==0).reduce((x,y)->x+y).orElseThrow());
       // System.out.println(integerList.stream().filter(x->x%2==0).reduce(Integer::sum).get());

//
//9)Подсчёт слов длиной > 5
//Дан список слов. Посчитай, сколько слов имеют длину больше 5 с помощью count.

        List<String> words=new ArrayList<>();
        words.add("Москва");
        words.add("Новосибирск");
        words.add("Казань");
        words.add("Чебоксары");
        words.add("Чебоксары");
        words.add("Омск");
        words.add("Новгород");

        System.out.println(words.stream().filter(x->x.length()>5).count());


//
//10)Найди первую строку, начинающуюся с буквы 'A'
//Используй findFirst для поиска строки, начинающейся на "A" из списка строк.

        List<String> lists=new ArrayList<>();
        lists.add("Anna");
        lists.add("Olga");
        lists.add("Andrew");
        lists.add("Dmitrii");
        lists.add("Nikolai");

        System.out.println(lists.stream().filter(x->x.contains("A")).findFirst().orElse("Такого слова нет!"));




    }
}
