package homeWork_37;

import java.util.Arrays;
import java.util.Comparator;
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
        List<String> nationality = userList.stream().map(x -> x.getNationality()).collect(Collectors.toList());
        System.out.println(nationality);

        //Получить список имён всех пользователей.
        List<String> names = userList.stream().map(x -> x.getFirstName()).collect(Collectors.toList());
        System.out.println(names);

        //Посчитать количество пользователей старше 18 лет.
        long counter = userList.stream().filter(x -> x.getAge() > 18).count();
        System.out.println(counter);
        //Найти самого младшего пользователя.
        List<UserTest> userMin = userList.stream().min(Comparator.comparing(x -> x.getAge())).stream().toList();
        System.out.println(userMin);
        //Найти самого старшего пользователя.
        List<UserTest> userMax = userList.stream().max(Comparator.comparing(x -> x.getAge())).stream().toList();
        System.out.println(userMax);
        //Есть ли в списке пользователь с национальностью "FR"?
        boolean user = userList.stream().anyMatch(x -> x.getNationality().equals("FR"));
        System.out.println("\n" + user);
        //Получить список фамилий пользователей с именем "Michael".
        List<String> usersName = userList.stream().filter(x -> x.firstName.equals("Michael")).
                map(UserTest::getLastName).toList();
        System.out.println("\n" + usersName);
        //Найти пользователя с id = 3.

        userList = userList.stream().filter(x -> x.getId() == 3).toList();
        System.out.println(userList);

        //Проверить, есть ли пользователь с именем "Anna".

    }
}

