package homeWork_28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork_28 {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("dog", "собака");
        dictionary.put("cat", "кошка");
        dictionary.put("cow", "корова");
        dictionary.put("lion", "лев");
        dictionary.put("goose", "гусь");

        do {
            System.out.println();
            System.out.println("Если хотите выйти из программы---> введите exit\n" +
                    "Если хотите распечатать словарь---> введите print ");
            System.out.print("Введите слово: ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            word = word.toLowerCase();


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
