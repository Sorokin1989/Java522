package Homework5;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/java522";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException exception) {
            throw new RuntimeException("Error! не удалось подключится к БД " + exception);
        }
    }
}

class Student {
    int id;
    String name;
    int age;
    String groupName;


    public Student(String name, int age, String groupName) {
        this.name = name;
        this.age = age;
        this.groupName = groupName;
    }

    public Student(int id, String name, int age, String groupName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + groupName;
    }

    public static void insertStudent(Student student) {
        String query = "insert into Students(name,age,groupName) values(?,?,?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setString(3, student.getGroupName());
            statement.executeUpdate();
            System.out.println("Student inserted successfully");
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void insertStudents(List<Student> list) {
        String query = "insert into Students(name,age,groupName) values(?,?,?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            int count = 0;
            for (Student student : list) {
                statement.setString(1, student.getName());
                statement.setInt(2, student.getAge());
                statement.setString(3, student.getGroupName());
                statement.executeUpdate();
                count++;
            }
            System.out.println("Student inserted successfully " + count + " students");
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static List<Student> getAllStudents() {
        String query = "select * from Students";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);) {

            List<Student> list = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String groupName = resultSet.getString("groupName");

                list.add(new Student(id, name, age, groupName));
            }
            return list;
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            return new ArrayList<Student>();
        }
    }

    public static Student getStudentById(int id) {
        String query = "select * from Students where id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("groupName")
                );
            } else
                System.out.println("Студент не найден!");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }

    public static boolean updateStudent(Student student) {
        String query = "update Students set name = ?, age = ?, groupName = ? where id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setString(3, student.getGroupName());
            statement.setInt(4, student.getId());

            int count = statement.executeUpdate();
            if (count == 0) {
                System.out.println("Такого id не существует!");
                return false;
            }
            System.out.println("Student updated successfully " + count + " students");
            return true;

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());

        }
        return false;
    }

    public static void deleteStudentById(int id) {
        Student deleteStudent = getStudentById(id);
        if (deleteStudent == null) {
            System.out.println("Student not found");
            return;
        }

        String query = "delete from Students where id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Student deleted successfully " + deleteStudent.getName() + " " + deleteStudent.getAge() + " " + deleteStudent.getGroupName());
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            ;
        }
    }

    public static void deleteAll() {
        String query = "delete from Students ";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            int count = statement.executeUpdate();
            System.out.println("Удалены " + count + " студентов!");

            if (count > 0) {

                try (Statement alterStatement = connection.createStatement()) {
                    alterStatement.executeUpdate("ALTER TABLE students AUTO_INCREMENT = 1");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}


public class Homework5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        System.out.println(" Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст студента: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название группы студента");
        String groupName = scanner.nextLine();

        Student student = new Student(name, age, groupName);
        Student.insertStudent(student);


    }


    public static void addStudents() {
        List<Student> list = new ArrayList<>();

        while (true) {
//                                        scanner.nextLine();
            System.out.println(" Введите имя студента: ");
            String name = scanner.nextLine();
            System.out.println("Введите возраст студента: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите название группы студента");

            String groupName = scanner.nextLine();

            Student student = new Student(name, age, groupName);


            list.add(student);

            System.out.println("Добавить еще?\n" +
                    "1 --> Да\n" +
                    "2 --> Нет");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num == 2) {
                Student.insertStudents(list);
                break;
            }

        }
    }

    public static void printInfo() {
        List<Student> list = Student.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Список студентов пуст! Сначала добавьте студентов!");
        }
        for (Student studentList : list) {
            System.out.println(studentList);
        }
    }

    public static void searchID() {
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        List<Student> list = Student.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Список студентов пуст! Сначала добавьте студентов!");
        }
        System.out.println(Student.getStudentById(id));
    }

    public static void updateStudentsID() {
        List<Student> list = Student.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Список студентов пуст! Сначала добавьте студентов!");
        }
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст студента: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название группы: ");
        String groupName = scanner.nextLine();
        Student student = new Student(id, name, age, groupName);

        Student.updateStudent(student);

    }

    public static void deleteStudentsID() {
        List<Student> list = Student.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Список студентов пуст! Сначала добавьте студентов!");
        }
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        Student.deleteStudentById(id);
    }

    public static void deleteAllStudents() {
        List<Student> list = Student.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Список студентов пуст! Сначала добавьте студентов!");
        }
        boolean activeFlag = true;
        while (activeFlag) {
            System.out.println("Вы уверены?\n" +
                    "1 --> Да\n" +
                    "2 --> Нет");
            int select = scanner.nextInt();
            switch (select) {
                case 1:

                    Student.deleteAll();
                    System.out.println("Список студентов удален!");
                    activeFlag = false;
                    break;
                case 2:
                    activeFlag = false;
                    break;
                default:
                    System.out.println("Введите корректное значение!");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        try {


            DatabaseConnection databaseConnection = new DatabaseConnection();

            try (Connection connection = databaseConnection.getConnection();
                 Statement statement = connection.createStatement()) {

                String sql = "create table Students(\n" +
                        "id int AUTO_INCREMENT unique,\n" +
                        "name nvarchar(50),\n" +
                        "age int,\n" +
                        "groupName nvarchar(50)\n" +
                        ")";
                statement.executeUpdate(sql);
                System.out.println("Table created");
            } catch (SQLException e) {
                System.out.println("Таблица уже существует " + e.getMessage());

            }


            //Задание на CRUD c объектом Student
            //
            //Класс Student должен иметь 4 поля:
            //int id
            //String name
            //int age
            //String groupName
            //
            //1. Создать таблицу Students ок
            //
            //2. Создать класс Student с геттерами/сеттерами ок
            //
            //3. Реализовать метод insertStudent(Student s) ок
            //
            //4. Реализовать метод insertStudents(List<Student> list) ok
            //
            //5. Реализовать метод getAllStudents() ок
            //Возвращает List<Student>
            //
            //6. Реализовать метод getStudentById(int id) ок
            //Делает SELECT с WHERE
            //Если студент не найден — возвращать null.
            //
            //7. Реализовать метод updateStudent(Student s) ок
            //Обновляет поля name, age, group_name по id.
            //
            //8. Реализовать метод deleteStudentById(int id) ok
            //Удаляет одного студента.
            //
            //9. Реализовать метод deleteAll() ок
            //Удаляет всех студентов из таблицы.
            //
            //
            //10. Написать меню в main() ок
            //
            //1 - Добавить студента
            //2 - Показать всех
            //3 - Найти по id
            //4 - Обновить по id
            //5 - Удалить по id
            //6 - Удалить всех
            //0 - Выход

//        String name=scanner.nextLine();
//        int age= scanner.nextInt();
//        String groupName= scanner.nextLine();
//        scanner.nextLine();

//        Student student=new Student(name,age,groupName);
            int num;

            while (true) {

                System.out.println("1 --> Добавить студента\n" +
                        "2 --> Показать всех\n" +
                        "3 --> Найти по id\n" +
                        "4 --> Обновить по id\n" +
                        "5 --> Удалить по id\n" +
                        "6 --> Удалить всех\n" +
                        "0 --> Выход");
                try {
                    System.out.println("Введите значение от 0 до 6");
                    num = scanner.nextInt();
                    scanner.nextLine();


                    switch (num) {
                        case 1:
                            boolean isFlag = false;
                            while (!isFlag) {
                                System.out.println("Выберите:\n" +
                                        "1 --> Добавить одного студента\n" +
                                        "2 --> Добавить нескольких студентов\n" +
                                        "3 --> Назад");

                                num = scanner.nextInt();
                                scanner.nextLine();

                                switch (num) {
                                    case 1:
                                        addStudent();
                                        break;
                                    case 2:
                                        addStudents();
                                        break;
                                    case 3:
                                        System.out.println("Назад");
                                        isFlag = true;
                                        break;
                                    default:
                                        System.out.println("Введите корректное значение!");
                                }

                            }
                            break;
                        case 2:
                            printInfo();
                            break;
                        case 3:
                            searchID();
                            break;
                        case 4:
                            updateStudentsID();
                            break;
                        case 5:
                            deleteStudentsID();
                            break;
                        case 6:
                            deleteAllStudents();
                            break;
                        case 0:
                            System.out.println("Выход");
                            return;
                        default:
                            System.out.println("Некорректное значение!");

                    }
                } catch (Exception exception) {
                    System.out.println("Введите числовое значение! " + exception.getMessage());
                    scanner.nextLine();


                }

            }


        } catch (Exception exception) {
            System.out.println("Error" + exception.getMessage());
        } finally {
            scanner.close();
        }
    }

}
