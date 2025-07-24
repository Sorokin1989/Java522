package homeWork_37;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
                new UserTest(2, "Mary", "Matricia", 11, "EN"),
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

        List<UserTest> userLists = userList.stream().filter(x -> x.getId() == 3).toList();
        System.out.println(userLists);

        //Проверить, есть ли пользователь с именем "Anna".
        boolean name = userList.stream().anyMatch(x -> x.getFirstName().equals("Anna"));
        System.out.println(name);

//Среднего уровня сложности

//Получить список пользователей, у которых имя и фамилия начинаются с одной и той же буквы
        List<UserTest> usersNames = userList.stream().filter(x -> x.getFirstName().charAt(0) == x.getLastName().charAt(0)).toList();
        System.out.println(usersNames);
//Отсортировать пользователей по возрасту по возрастанию.
        List<UserTest> usersAge = userList.stream().sorted(Comparator.comparing(UserTest::getAge)).toList();
        System.out.println();
        for (UserTest userTest : usersAge) {
            System.out.println(userTest);
        }

//Отсортировать пользователей по фамилии по убыванию.
        System.out.println();
        List<UserTest> usersSurname = userList.stream().sorted(Comparator.comparing(UserTest::getLastName).reversed()
        ).toList();
        for (UserTest userTest : usersSurname) {
            System.out.println(userTest);
        }

//Получить пользователя с максимальным возрастом среди "EN".
        List<UserTest> userAgeMax = userList.stream().filter(x -> x.getNationality().equals("EN")).
                max(Comparator.comparing(x -> x.getAge())).stream().toList();
        System.out.println(userAgeMax);
//Найти все уникальные имена среди пользователей.
        System.out.println();
        List<String> namesUn = userList.stream().map(UserTest::getFirstName).distinct().toList();
        System.out.println(namesUn);
//Сгруппировать пользователей по национальности.
        System.out.println();
        Map<String, List<UserTest>> usersNationality = userList.stream().collect(Collectors.groupingBy(UserTest::getNationality));
        for (Map.Entry<String, List<UserTest>> entry : usersNationality.entrySet()) {
            System.out.println("Национальность :" + entry.getKey());
            for (UserTest userTest : entry.getValue()) {
                System.out.println(userTest);
            }
        }

//Подсчитать, сколько пользователей в каждой национальности.
        // userList.stream().collect(Collectors.groupingBy(UserTest::getNationality)).forEach;
//Найти средний возраст всех пользователей.
        int sum = userList.stream().mapToInt(UserTest::getAge).sum();
        double ageAverage = (double) sum / userList.size();
        System.out.println("Средний возраст всех пользователей: " + ageAverage);
//Получить список пользователей с возрастом, кратным 5.
        List<UserTest> listAgeFive = userList.stream().filter(x -> x.getAge() % 5 == 0).toList();
        if (listAgeFive.isEmpty()) {
            System.out.println("Таких пользователей нет!");
        } else {
            System.out.println(listAgeFive);
        }
//Сформировать строку из всех имён, разделённых запятой.
     String userNames= userList.stream().map(UserTest::getFirstName).collect(Collectors.joining(","));
        System.out.println(userNames);

//Преобразовать список пользователей в список строк вида "Имя Фамилия (возраст)".
        System.out.println();
        List<String>usersString= userList.stream().map(x->x.getFirstName()+ " " +
                x.getLastName()+ " (" + x.getAge() + ")").toList();
        usersString.stream().forEach(System.out::println);




//Преобразовать список пользователей в Map<Long, String>, где ключ — id, значение — имя.
//Найти пользователей, у которых возраст совпадает с другим пользователем.
//Сгруппировать пользователей по возрасту и отсортировать по ключу.
//Найти возрастную категорию (до 18, 18–40, 40+) для каждого пользователя.
//Получить список первых 3 пользователей по возрасту.
//Пропустить первых 2 пользователя и вернуть остальных.
//Получить список пользователей, имя которых длиннее 5 символов.
//Проверить, все ли пользователи старше 10 лет.
//Есть ли хотя бы один пользователь с фамилией длиной более 7 символов?
    }
}

