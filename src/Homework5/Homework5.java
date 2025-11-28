package Homework5;


import java.util.ArrayList;
import java.util.List;

class Student{
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
        return  id + " " + name + " " + age + " " + groupName;
    }
}


public class Homework5 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"Dima",36,"4a1"));
        students.add(new Student(2,"David",35,"4a2"));
        students.add(new Student(3,"David",35,"4a3"));
        students.add(new Student(4,"David",35,"4a4"));
        for (Student student : students) {
            System.out.println(student);
        }
        //Задание на CRUD c объектом Student
        //
        //Класс Student должен иметь 4 поля:
        //int id
        //String name
        //int age
        //String groupName
        //
        //1. Создать таблицу Students
        //
        //2. Создать класс Student с геттерами/сеттерами
        //
        //3. Реализовать метод insertStudent(Student s)
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
