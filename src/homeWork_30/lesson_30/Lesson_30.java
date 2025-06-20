package homeWork_30.lesson_30;

import java.io.File;
import java.io.IOException;

public class Lesson_30 {
    public static void main(String[] args)  {

//      File file=new File("text2.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("Файл создан!");
//            }
//            else System.out.println("Файл уже существует!");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File file=new File("Dima");
//
//        if (file.mkdir()) {
//            System.out.println("Папка создана!");
//        }
//        else System.out.println("Папка уже существует!");
//
//        File file=new File("Dima/Dima/text.txt");
//
//        if (file.mkdirs()) {
//            System.out.println("Папка создана!");
//        }
//        else System.out.println("Папка уже существует!");
//


//
//        File file=new File("Dima");
//
//        if (file.delete()) {
//            System.out.println("Delete!");
//        }
//        else System.out.println("Not delete!");
//


//        File file=new File("Dima/Dima");
//
//        if (file.exists()) {
//            System.out.println("есть!");
//        }
//        else System.out.println("нет");
//
//
//        File file=new File("text.txt");
//
//        System.out.println("Файл :" + file.isFile());
//        System.out.println("Папка  :" + file.isDirectory());

        File oldFile=new File("text.txt");
        File newFile=new File("newName.txt");

        oldFile.renameTo(newFile);


    }

    }

