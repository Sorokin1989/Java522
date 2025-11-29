package Homework5;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/java522";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

            }

        } catch (SQLException e) {
            System.out.println("Connection error " + e.getMessage());
            ;
        }
        return connection;
    }
}


class Student {
    int id;
    String name;
    int age;
    String groupName;


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


}


public class Homework5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
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
            ;
        }

        List<Student> students = new ArrayList<Student>();

        Student student = new Student(1, "dima", 36, "4r1");
        Student student2 = new Student(3, "dima", 36, "4r1");
        student.insertStudent(student);
        student2.insertStudent(student2);


//        students.add(new Student(1,"Dima",36,"4a1"));
//        students.add(new Student(2,"David",35,"4a2"));
//        students.add(new Student(3,"David",35,"4a3"));
//        students.add(new Student(4,"David",35,"4a4"));
//        for (Student student : students) {
//            System.out.println(student);
//        }
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
        //4. Реализовать метод insertStudents(List<Student> list)
        //
        //5. Реализовать метод getAllStudents()
        //Возвращает List<Student>
        //
        //6. Реализовать метод getStudentById(int id)
        //Делает SELECT с WHERE
        //Если студент не найден — возвращать null.
        //
        //7. Реализовать метод updateStudent(Student s)
        //Обновляет поля name, age, group_name по id.
        //
        //8. Реализовать метод deleteStudentById(int id)
        //Удаляет одного студента.
        //
        //9. Реализовать метод deleteAll()
        //Удаляет всех студентов из таблицы.
        //
        //
        //10. Написать меню в main()
        //
        //1 - Добавить студента
        //2 - Показать всех
        //3 - Найти по id
        //4 - Обновить по id
        //5 - Удалить по id
        //6 - Удалить всех
        //0 - Выход
    }
}
