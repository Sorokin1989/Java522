package homeWork_37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserTest {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

    public UserTest(long id, String firstName, String lastName, int age, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + age + " " + nationality;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public static void main(String[] args) {
        List<UserTest> userList = Arrays.asList(
                new UserTest(1, "Michael", "Robert", 37, "TR"),
                new UserTest(2, "Mary", "Patricia", 11, "EN"),
                new UserTest(3, "John", "Michael", 7, "FR"),
                new UserTest(4, "Jennifer", "Linda", 77, "TR"),
                new UserTest(5, "William", "Elizabeth", 23, "US"),
                new UserTest(6, "Sue", "Jackson", 11, "IT"),
                new UserTest(7, "Michael", "Tommy", 37, "EN"));

        //Простые задачи
        //Найти всех пользователей с возрастом больше 30.
        List<UserTest> users = userList.stream().filter(x -> x.age > 30).collect(Collectors.toList());
        for (UserTest userTest : users) {
            System.out.println(userTest);
        }

        //Получить список всех уникальных национальностей.
        List<String> nationality = userList.stream().map(x -> x.getNationality()).distinct().toList();
        System.out.println(nationality);

        //Получить список имён всех пользователей.
        List


        //Посчитать количество пользователей старше 18 лет.
        //Найти самого младшего пользователя.
        //Найти самого старшего пользователя.
        //Есть ли в списке пользователь с национальностью "FR"?
        //Получить список фамилий пользователей с именем "Michael".
        //Найти пользователя с id = 3.
        //Проверить, есть ли пользователь с именем "Anna".

    }
}

