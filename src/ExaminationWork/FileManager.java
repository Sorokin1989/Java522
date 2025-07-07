package ExaminationWork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static List<User> loadUsers(String fileName) throws IOException {
        List<User> users=new ArrayList<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                String[] parts=line.split(",");
                if (parts.length>=2)
                    users.add(new User(parts[0],parts[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла пользователей " + e.getMessage());

        }
        return users;
    }

}
