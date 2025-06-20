package homeWork_30.lesson_30;

import java.io.File;
import java.io.IOException;

public class Lesson_30 {
    public static void main(String[] args)  {

        File file=new File("text.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
