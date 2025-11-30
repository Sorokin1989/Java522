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


    public Student(String name, int age, String groupName) {
//        this.id = id;
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
//                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String groupName = resultSet.getString("groupName");

                list.add(new Student(name, age, groupName));

            }
//                for (Student student:list){
//                    System.out.println(student);
//                }
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
//                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("groupName")
                );

            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }


    public static Student updateStudent(Student student) {
        String query = "update Students set name = ?, age = ?, groupName = ? where id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setString(3, student.getGroupName());
            statement.setInt(4, student.getId());
            int count = statement.executeUpdate();
            System.out.println("Student updated successfully " + count + " students");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            ;
        }
        return student;
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
//        String query = "delete from Students";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("TRUNCATE TABLE Students");
            System.out.println("Students deleted successfully");
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            ;
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

        }

//        List<Student> students = new ArrayList<Student>();

//        Student student = new Student(1, "dima", 36, "4r1");
//        Student student2 = new Student(3, "dima", 36, "4r1");
//        Student student3 = new Student(3, "dima", 36, "4r1");
//        Student student4 = new Student(3, "dima", 36, "4r1");
//        Student student5 = new Student(3, "dima", 36, "4r1");
//        Student student6 = new Student(3, "dima", 36, "4r1");
//        Student student7 = new Student(3, "dima", 36, "4r1");
//        students.add(student);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//        students.add(student6);
//        students.add(student7);

//        Student.insertStudents(students);
//
//
//        Student.getAllStudents();
//
//        System.out.println(Student.getStudentById(4));

//        Student.deleteStudentById(9);
//        Student.deleteAll();

//        student.insertStudent(student);
//        student2.insertStudent(student2);


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
        //10. Написать меню в main()
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
                        System.out.println(" Введите имя студента: ");
                        String name = scanner.nextLine();
                        System.out.println("Введите возраст студента: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите название группы студента");
                        String groupName = scanner.nextLine();
                        Student student = new Student(name, age, groupName);
                        Student.insertStudent(student);
                        break;
                    case 2:
                        List<Student> list=Student.getAllStudents();
                        for (Student studentList:list) {
                        System.out.println(studentList);
                        }
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    case 5:
                        System.out.println("5");
                        break;
                    case 6:
                        System.out.println("6");
                        break;
                    case 0:
                        System.out.println("0");
                        return;
                    default:
                        System.out.println("Некорректное значение!");

                }
            } catch (Exception exception) {
                System.out.println("Введите числовое значение! " + exception.getMessage());
                scanner.nextLine();


            }

        }


    }
}
