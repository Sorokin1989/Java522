package homeWork_30.lesson_30;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson_30 {

//    public static void printDirectoryTree(File folder, String str) {
//        if (folder == null || !folder.exists()) return;
//        File[] files = folder.listFiles();
//        if (files == null) return;
//        for (File f : files) {
//            if (f.isDirectory()) {
//                System.out.println(str + "|--" + f.getName() + "(#)");
//                printDirectoryTree(f,str+"  ");
//            } else {
//                System.out.println(str + "|--" + f.getName() + "(*)");
//            }
//        }
//
//    }


    public static void main(String[] args) throws IOException {

//        FileWriter fileWriter=new FileWriter("test.txt");
//        fileWriter.write("Hello Dima");
//        fileWriter.close();
//        File file=new File("testet.txt");
//        file.createNewFile();
//
//        FileWriter fileWriter=new FileWriter(file);
//        fileWriter.write("Hello Dima");
//     fileWriter.close();
//       FileWriter fileWriter=new FileWriter("test.txt",true);
//        fileWriter.write("Dima");
//       fileWriter.close();

//        FileWriter fileWriter=new FileWriter("test.txt");
//        fileWriter.write(new char[]{'D','i','m','a'});
//
//
//        fileWriter.close();



//        System.out.println("(*) --> Это файл ");
//        System.out.println("(#) --> Это папка ");
//        File rootFolder =new File("C:\\");
//        printDirectoryTree(rootFolder,"");
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

//        File oldFile=new File("newName.txt");
//        File newFile=new File("ok.txt");
//
//        oldFile.renameTo(newFile);


//        File newFile=new File("ok.txt");
//        System.out.println("Size: " + newFile.length());

//        File newFile=new File("ok.txt");
//        System.out.println("File        : " + newFile.getName());
//        System.out.println("Path        : " + newFile.getPath());
//        System.out.println("AbsolutePath: " + newFile.getAbsolutePath());
//        System.out.println("Data update       : " + newFile.lastModified());
//        System.out.println("Read       : " + newFile.canRead());
//        System.out.println("Run        : " + newFile.canExecute());
//        System.out.println("Zapic        : " + newFile.canWrite());
//
//        newFile.setReadable(false);

//        File folder = new File("C:\\SCANNER");
//
//        String[] names = folder.list();
//        for (String name : names) {
//
//            System.out.println(name);
//            File file = new File(folder.getAbsoluteFile() + "\\" + name);
//            String[] names2 = file.list();
//            for (String name2 : names2) {
//                System.out.println(name2);
//            }
//            break;

        //   }
//        File folder = new File("C:\\SCANNER");
//
//       File[] files = folder.listFiles();
//        for (File file : files) {
//
//            System.out.println((file.isFile()?"File "  : "Folder") + " " + file.getName());
//        }

//        File folder=new File("data");
//        folder.mkdir();
//        File file=new File(folder,"test.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File rootFolder=new File("C:\\");
//
//        int count=1;
//        for (File file :rootFolder.listFiles()) {
//            System.out.println(count++ + ") " + file.getName());
//
//            for (File subFile : Objects.requireNonNull(file.listFiles())) {
//                System.out.println("---" + subFile.getName());
//            }
//
//        }


    }
}
