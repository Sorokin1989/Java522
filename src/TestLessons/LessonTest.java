package TestLessons;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + year;
    }
}
class Library {
    List<Book>bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }
}
class Student{
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }
}
class Classroom{
    List<Student>studentList;

    public Classroom(List<Student> studentList) {
        this.studentList = studentList;
    }
}
interface Playable{
    void play();

}
class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Играть на гитаре");

    }
}
class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("Играть на пианино");

    }
}


public class LessonTest {
    public static void main(String[] args) {
        //Задачи для практики
        //Задача 1: Создай класс Book с полями title, author, year.
        //Создай класс Library, который содержит список книг.
        //Добавь несколько книг в библиотеку и выведи их список.

        List<Book>bookList=new ArrayList<>();
        bookList.add(new Book("Карлсон","Дима",2005));
        bookList.add(new Book("мушкетер","коляДима",1905));
        bookList.add(new Book("ляляля","николДима",1995));

        for (Book book:bookList) {
            System.out.println(book);
        }

        Library library=new Library(bookList);
        for (Book library1:library.bookList) {
            System.out.println(library1);
        }

        //
        //Задача 2: Создай класс Student с полями name, grade.
        //Создай класс Classroom, который содержит список студентов.
        //Добавь студентов и выведи их имена и оценки.
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Дима",5));
        studentList.add(new Student("Дима",5));
        studentList.add(new Student("Дима",5));
        studentList.add(new Student("Дима",5));
        studentList.add(new Student("Дима",5));

        Classroom classroom=new Classroom(studentList);
        for (Student student:classroom.studentList) {
            System.out.println(student);
        }
        //
        //Задача 3: Создай интерфейс Playable с методом play().
        //Реализуй классы Guitar и Piano, которые реализуют этот интерфейс.
        //Создай объекты и вызови метод play() для каждого.

        Guitar guitar=new Guitar();
        guitar.play();
        Piano piano=new Piano();
        piano.play();



        //
        //Задача 4: Создай класс Employee с полями name, salary.
        //Создай класс Company, который содержит список сотрудников.
        //Добавь сотрудников и выведи их имена и зарплаты.
        //
        //Задача 5: Создай класс Product с полями name, price.
        //Создай класс Store, который содержит список товаров.
        //Добавь товары и выведи их список с ценами.

    }
}

