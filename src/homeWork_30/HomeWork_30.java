package homeWork_30;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.Scanner;

public class HomeWork_30 {
    private static String fileName;
    private static String newFileName;
    private static  final File folder=new File("C:\\lessons java\\Java522\\");
    private static final Scanner scanner = new Scanner(System.in);

    public HomeWork_30(String fileName) {
        HomeWork_30.fileName = fileName;
    }


    public static void createFile() throws IOException {
        System.out.println("Введите название файла: ");
         fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("Файл создан!" + file.getAbsolutePath());
        } else System.out.println("Файл уже существует или не может быть создан!");
    }

    public static void createDirectory() throws IOException {
        System.out.println("Введите название папки: ");
        String dirName = scanner.nextLine();
        File dir = new File(dirName);
        if (dir.mkdir()) {
            System.out.println("Папка создана!" + dir.getAbsolutePath());
        } else System.out.println("Папка уже существует или не может быть создана!");
    }

    public static void writeToFile() throws IOException {
        System.out.println("Введите текст в файл: ");
        String str = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(str);
        fileWriter.close();
    }

    public static void writeToFileNotDelete() throws IOException {
        System.out.println("Введите текст в файл: ");
        String str = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write(str);
        fileWriter.close();
    }

    public static void readToFile() throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void printInfo() {
        File file = new File(String.valueOf(fileName));
        System.out.println("File              : " + file.getName());
        System.out.println("Path              : " + file.getPath());
        System.out.println("Size              : " + file.length());
        System.out.println("AbsolutePath      : " + file.getAbsolutePath());
        System.out.println("Data update       : " + file.lastModified());
        System.out.println("Read              : " + file.canRead());
        System.out.println("Run               : " + file.canExecute());
        System.out.println("Write             : " + file.canWrite());
    }

    public static void reNameTo() {
        File oldFile = new File(fileName);
        File newFile = new File(newFileName);
        oldFile.renameTo(newFile);
    }

    public static void deleteFile() {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Файл удален!");
        } else System.out.println("Файл не удален или не существует!");
    }
    public static void deleteFolder() {
        File folderToDelete = new File(fileName);
        if (folderToDelete.exists() && folderToDelete.isDirectory()) {
            if (Objects.requireNonNull(folderToDelete.list()).length == 0) {
                if (folderToDelete.delete()) {
                    System.out.println("Папка удалена");
                } else {
                    System.out.println("Не удалось удалить папку");
                }
            } else {
                System.out.println("Папка не пуста");
            }
        } else {
            System.out.println("Папка не существует");
        }
    }

    public static void moveFile() throws IOException {
        System.out.println("Введите текущее имя файла!");
        String sourceName = scanner.nextLine();
        System.out.println("Введите новое имя файла!");
        String destName = scanner.nextLine();
        File source = new File(sourceName);
        File dest = new File(destName);
        if (!source.exists()) {
            System.out.println("Текущего файла не существует!");
            return;
        }
        Files.move(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Файл перемещен!");
    }

    public static void printDirectoryTree(File folder, String str) {
        if (!folder.exists()) return;
        File[] files = folder.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(str + "|--" + f.getName() + "(Папка)");
                printDirectoryTree(f, str + "  ");
            } else {
                System.out.println(str + "|--" + f.getName() + "(Файл)");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.println("1---> Создание объектов файловой системы\n" +
                            "2---> Запись в файл\n" +
                            "3---> Чтение из файла\n" +
                            "4---> Получение информации\n" +
                            "5---> Переименование\n" +
                            "6---> Удаление\n" +
                            "7---> Перемещение\n" +
                            "8---> Отображение структуры папок\n" +
                            "9---> Выход");

                    int select = scanner.nextInt();
                    scanner.nextLine();

                    switch (select) {
                        case 1:

                            System.out.println("1-Создание нового текстового файла по указанному пути\n" +
                                    "2-Создание новой папки по указанному пути");
                            int selectNum = scanner.nextInt();
                            switch (selectNum) {
                                case 1:
                                    scanner.nextLine();
                                    createFile();
                                    break;
                                case 2:
                                    scanner.nextLine();
                                    createDirectory();
                                    break;

                                default:
                                    System.out.println("Введите правильное значение!");

                            }
                        case 2:
                            System.out.println("1-Запись строки в файл (с перезаписью содержимого)\n" +
                                    "2-Добавление строки в конец файла (без удаления существующего текста)");
                            int selectNum2 = scanner.nextInt();
                            switch (selectNum2) {
                                case 1:
                                    scanner.nextLine();
                                    writeToFile();
                                    break;
                                case 2:
                                    scanner.nextLine();
                                    writeToFileNotDelete();
                                    break;
                                default:
                                    System.out.println("Введите правильное значение!");
                            }
                            break;
                        case 3:
                            readToFile();
                            break;
                        case 4:
                            printInfo();
                            break;
                        case 5:
                            System.out.println("Введите новое имя файла/папки:");
                            newFileName = scanner.nextLine();
                            reNameTo();
                            break;
                        case 6:
                            System.out.println("1-Удаление файла\n" +
                                    "2-Удаление пустой папки");
                           int selectNum3 = scanner.nextInt();
                           scanner.nextLine();
                            switch (selectNum3) {
                                case 1:
                                    deleteFile();
                                    break;
                                case 2:
                                    deleteFolder();
                                    break;
                                default:
                                    System.out.println("Введите корректное значение!");
                            }
                            break;
                        case 7:
                            moveFile();
                            break;
                        case 8:
                            printDirectoryTree(folder, "");
                            break;
                        case 9:
                            System.out.println("Вы вышли!");
                           return;
                        default:
                            System.out.println("Введите корректное значение!");

                    }
                } catch (Exception e) {
                    System.out.println("Ошибка!" + e.getMessage());
                    scanner.nextLine();
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
