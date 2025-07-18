package ExaminationWork;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static ExaminationWork.PhoneBook.getFileContact;

public class FileManager {

    public static List<User> loadUsers(String fileName) throws IOException {
        List<User> users = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" : ");
                if (parts.length >= 2)
                    users.add(new User(parts[0], parts[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла пользователей " + e.getMessage());

        }
        return users;
    }

    public static void saveUsers(List<User> users, String fileName) {
        if (users == null || users.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            for (User user : users) {
                bufferedWriter.write(user.getUsername() + " : " + user.getPassword());
                bufferedWriter.newLine();
            }
            System.out.println("Пользователь успешно сохранен в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи файла пользователей " + e.getMessage());
        }

    }

    public static void saveUser(User user, String userName) {
        String filename = "user_" + userName + ".txt"; // имя файла на основе логина
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(user.getUsername() + " : " + user.getPassword() + " : " + User.getCreationUser().withSecond(0).withNano(0));
            System.out.println("Пользователь успешно сохранен в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении пользователя: " + e.getMessage());
        }
    }

    public static List<Contact> loadContact(String fileName) throws IOException {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 5) {
                    //int id = Integer.parseInt(parts[0]);
                    String name = parts[0];
                    String surname = parts[1];
                    String phoneNumber = parts[2];
                    int age = Integer.parseInt(parts[3]);
                    String gender = parts[4];
                    Contact contact = new Contact(name, surname, phoneNumber, age, gender);
                    contacts.add(contact);
                }
            }

        } catch (Exception e) {
            System.out.println("Ошибка чтения контактов! " + e.getMessage());
        }
        return contacts;
    }

    //    public static void saveContact(List<Contact> contacts,String fileName) throws IOException {
//        try {
//            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(fileName));
//            for (Contact contact:contacts) {
//                bufferedWriter.write(contact.getId() + "|" + contact.getName()+ "|" + contact.getSurname()
//                + "|" + contact.getPhoneNumber() + "|" + contact.getAge());
//                bufferedWriter.newLine();
//            }
//        } catch (Exception e) {
//            System.out.println("Ошибка записи контактов " + e.getMessage());
//        }
//    }
    public static void saveContactsToFile(String userName, List<Contact> contacts) throws IOException {
        String dirName = "contacts/"; // можно удалить
        File dir = new File(dirName); // можно удалить
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String fileName = dirName + userName + "_" + getFileContact();


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Contact contact : contacts) {
                writer.write(contact.getId() + "|" + contact.getName() + "|" + contact.getSurname() + "|" +
                        contact.getPhoneNumber() + "|" + contact.getAge() + "|" + contact.getGender());
                writer.newLine();
            }
            System.out.println("Контакты успешно сохранены в файл " + userName + ".txt");


        }
    }

    public static void createFileContact(String userName) throws IOException {
        String dirName = "contacts/";
        File dir = new File(dirName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String fileName = dirName + userName + "_" + getFileContact();
        new BufferedWriter(new FileWriter(fileName));
        System.out.println("Создан файл для контактов " + userName + ".txt");
    }
}
