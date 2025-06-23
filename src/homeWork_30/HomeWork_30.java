package homeWork_30;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork_30 {
     private static String fileName;
     private static Scanner scanner=new Scanner(System.in);

    public HomeWork_30(String fileName) {
        this.fileName = fileName;
    }


    public static void createFile() throws IOException {
    System.out.println("Введите название файла: ");
    String fileName=scanner.nextLine();
    File file=new File(fileName);
    if (file.createNewFile()) {
        System.out.println("Файл создан!" + file.getAbsolutePath());
    }
    else System.out.println("Файл уже существует или не может быть создан!");
}

    public static void createDirectory() throws IOException {
        System.out.println("Введите название папки: ");
        String dirName=scanner.nextLine();
        File dir=new File(dirName);
        if (dir.mkdir()) {
            System.out.println("Папка создана!" + dir.getAbsolutePath());
        }
        else System.out.println("Папка уже существует или не может быть создана!");
    }

    public static void writeToFile() throws IOException {
        System.out.println("Введите текст в файл: ");
        String str=scanner.nextLine();
        FileWriter fileWriter=new FileWriter(fileName);
        fileWriter.write(str);
       fileWriter.close();
    }

    public static void writeToFileNotDelete() throws IOException {
        System.out.println("Введите текст в файл: ");
        String str=scanner.nextLine();
        FileWriter fileWriter=new FileWriter(fileName,true);
        fileWriter.write(str);
        fileWriter.close();
    }




    public static void main(String[] args) {


        System.out.println("1---> Создание объектов файловой системы\n" +
                "2---> Запись в файл\n" +
                "3---> Чтение из файла\n" +
                "4---> Получение информации\n" +
                "5---> Переименование\n" +
                "6---> Удаление\n" +
                "7---> Перемещение\n" +
                "8---> Отображение структуры папок");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();


        while (true) {
            switch (select) {
                case 1:

                    System.out.println("1-Создание новой папки по указанному пути\n" +
                            "2-Создание нового текстового файла по указанному пути");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1, 2:
                            break;
                        default:
                            System.out.println("Введите правильное значение!");
                    }
                    break;
                case 2:
                    System.out.println("1-Запись строки в файл (с перезаписью содержимого)\n" +
                            "2-Добавление строки в конец файла (без удаления существующего текста)");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1,2:
                            break;
                        default:
                            System.out.println("Введите правильное значение!");
                    }
                    break;
                case 3:
                    System.out.println("Чтение из файла");
                    break;
                case 4:
                    System.out.println("Получение сведений");
                    break;
                case 5:
                    System.out.println("Переименование файла или папки");
                    break;
                case 6:
                    System.out.println("1-Удаление файла\n" +
                            "2-Удаление пустой папки");
                    break;
                case 7:
                    System.out.println();
                    break;
                case 8:
                    System.out.println();
                default:
                    System.out.println("Введите корректное значение!");

            }
        }
        //1) Создание объектов файловой системы
        //-- Создание новой папки по указанному пути
        //-- Создание нового текстового файла по указанному пути
        //
        //2)Запись в файл
        //--Запись строки в файл (с перезаписью содержимого)
        //--Добавление строки в конец файла (без удаления существующего текста)
        //
        //3)Чтение из файла
        //--Отображение содержимого файла в консоли
        //
        //4)Получение информации
        //--Получение сведений о файле или папке: имя, путь, абсолютный путь, размер, права доступа (чтение, запись, выполнение)
        //
        //5)Переименование
        //--Переименование файла или папки на новое имя или с изменением полного пути
        //
        //6)Удаление
        //--Удаление файла
        //--Удаление пустой папки
        //
        //7)Перемещение
        //--Перемещение файла или папки по новому указанному пути
        //
        //8)Отображение структуры папок
        //--Рекурсивный вывод дерева папок и файлов, начиная с указанного пути
    }
}
