package ExaminationWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static List<User> loadUsers(String fileName) throws IOException {
        List<User> users = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2)
                    users.add(new User(parts[0], parts[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла пользователей " + e.getMessage());

        }
        return users;
    }

    public static void saveUsers(List<User> users, String fileName) throws IOException {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (User user : users) {
                bufferedWriter.write(user.getUsername() + "," + user.getPassword());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи файла пользователей " + e.getMessage());
        }

    }

    public static List<Contact> loadContact(String fileName) throws IOException {
        List<Contact> contacts = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) ;
            String[] parts = line.split("\\|");
            if (parts.length == 5) {
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String surname = parts[2];
                int phoneNumber = Integer.parseInt(parts[3]);
                int age = Integer.parseInt(parts[4]);
                Contact contact = new Contact(name, surname, phoneNumber, age);
                contacts.add(contact);

            }

        } catch (Exception e) {
            System.out.println("Ошибка чтения контактов! " + e.getMessage());
        }
        return contacts;
    }
    public static void saveContact(List<Contact> contacts,String fileName) throws IOException {
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(fileName));
            for (Contact contact:contacts) {
                bufferedWriter.write(contact.getId() + "|" + contact.getName()+ "|" + contact.getSurname()
                + "|" + contact.getPhoneNumber() + "|" + contact.getAge());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи контактов " + e.getMessage());
        }
    }
}
