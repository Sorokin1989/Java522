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

        File file=new File("Dima");

        if (file.mkdir()) {
            System.out.println("Папка создана!");
        }
        else System.out.println("Папка уже существует!");


    }
}
