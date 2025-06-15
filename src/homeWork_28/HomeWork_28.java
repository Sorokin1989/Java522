package homeWork_28;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class HomeWork_28 {

    public static int countNum(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;

    }

    public static int countLetter(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("dog", "собака");
        dictionary.put("cat", "кошка");
        dictionary.put("cow", "корова");
        dictionary.put("lion", "лев");
        dictionary.put("goose", "гусь");

        do {
            System.out.println();
            System.out.println("=> Выйти из программы---> введите exit\n" +
                    "=> Распечатать словарь---> введите print \n" +
                    "=> Очистить словарь----> введите cls\n" +
                    "=> Количество пар слов в словаре-----> введите size\n" +
                    "=> Количество букв в словаре------> введите letter\n" +
                    "=> Количество чисел в словаре------> введите num\n" +
                    "=> Удалить слово по ключу-------> введите delete");

            System.out.print("Введите слово: ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            word = word.toLowerCase();

            if (word.equals("update")) {
                while (true) {
                    System.out.println("Введите правильный ключ: ");
                    String keyWord = scanner.nextLine();
                    keyWord = keyWord.toLowerCase();
                    for (String key : dictionary.keySet()) {
                        if (Objects.equals(keyWord, key)) {
                            System.out.println("Введите новое значение: ");
                            word = scanner.nextLine();
                        }
                    }

                    if (dictionary.containsKey(keyWord)) {
                        dictionary.replace(keyWord, word);
                        break;
                    }
                }
                continue;
            }

            if (word.equals("delete")) {
                while (true) {
                    System.out.println("Введите ключ : ");
                    String keyWord = scanner.nextLine();
                    keyWord = keyWord.toLowerCase();
                    if (dictionary.containsKey(keyWord)) {
                        dictionary.remove(keyWord);
                        System.out.println("Ключ '" + keyWord + "' удален.");
                        break;
                    } else {
                        System.out.println("Ключ '" + keyWord + "' не найден. Введите правильный ключ!");
                    }

                }
                continue;
            }


            if (word.equals("num")) {
                int countNum = 0;
                for (String key : dictionary.keySet()) {
                    countNum = countNum + countNum(key);
                    String value = dictionary.get(key);
                    if (value != null) {
                        countNum = countNum + countNum(value);
                    }
                }
                System.out.println("Количество чисел в словаре: " + countNum);
                continue;
            }

            if (word.equals("letter")) {
                int countLetter = 0;
                for (String key : dictionary.keySet()) {
                    countLetter = countLetter + key.length();
                    String value = dictionary.get(key);
                    if (value != null) {
                        countLetter = countLetter + countLetter(value);
                    }
                }
                System.out.println("Количество букв в словаре: " + countLetter);
                continue;
            }

            if (word.equals("cls")) {
                dictionary.clear();
                System.out.println("СЛОВАРЬ ОЧИЩЕН!");
                continue;
            }

            if (word.equals("size")) {
                System.out.println("Количество пар слов: " + dictionary.size());
                continue;

            }


            if (word.equals("exit")) {
                System.out.println("До свидания!");
                break;
            }


            if (word.equals("print")) {
                int count = 1;
                for (String key : dictionary.keySet()) {
                    System.out.println(count++ + ") " + key + " (en)=> " + dictionary.get(key) + " (ru) ");
                }
            } else if (dictionary.containsKey(word)) {
                System.out.println(word + " (en)=> " + dictionary.get(word) + " (ru) ");
            } else if (dictionary.containsValue(word)) {

                for (String key : dictionary.keySet()) {
                    if (dictionary.get(key).equals(word)) {
                        System.out.println(word + " (ru)=> " + key + " (en) ");
                        break;
                    }
                }
            } else {
                System.out.println("Нет такого слова! Хотите его добавить???" + "\n1 - Да\n2 - Нет");

                int select = scanner.nextInt();

                switch (select) {
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Введите перевод данного слова: ");
                        String translate = scanner1.nextLine();
                        translate = translate.toLowerCase();

                        System.out.println("Слово переведено с \n" + "1 - (en) => (ru)\n " +
                                "2 - (ru) => (en)\n " + "3 - Отмена ");
                        select = scanner.nextInt();

                        switch (select) {
                            case 1:
                                dictionary.put(word, translate);
                                System.out.println("Слово было добавлено!");
                                break;
                            case 2:
                                dictionary.put(translate, word);
                                System.out.println("Слово было добавлено!");
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Некорректное значение!");

                        }


                        break;
                    case 2:
                        System.out.println("Слово не добавлено!");
                        break;
                    default:
                        System.out.println("Некорректное значение!");
                }


            }


        }
        while (true);
    }
}
