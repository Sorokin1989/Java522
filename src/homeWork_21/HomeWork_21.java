package homeWork_21;

public class HomeWork_21 {
    public static void main(String[] args) {

        //✅ Задание 1: Класс Person
        //Создайте класс Person с приватными полями name (строка) и age (целое число).
        //Добавьте геттеры и сеттеры для этих полей.
        //Проверьте, что к полям нельзя получить доступ напрямую из другого класса.
        Person person = new Person();
        // person.age=50; нельзя обратится к полю age напрямую!!!
        person.setAge(100);
        person.setName("Программист");
        System.out.println(person.getAge());
        System.out.println(person.getName());


        //
        //✅ Задание 2: Валидация возраста
        //Модифицируйте класс Person: в сеттере для поля age запретите устанавливать отрицательные значения.
        //Если передано недопустимое значение — игнорируйте установку и выведите сообщение об ошибке в консоль.
        //
        // age>0 и age<100 (условие)


        //✅ Задание 3: Только для чтения
        //Создайте класс BankAccount с приватным полем balance.
        //Сделайте так, чтобы можно было только получить текущее значение баланса, но нельзя напрямую изменить его извне.
        //Добавьте метод deposit() для пополнения счёта и withdraw() — для снятия средств.
        //
        BankAccount bankAccount = new BankAccount();
        try {
            System.out.println("Вы внесли: " + bankAccount.deposit(1000));
            System.out.println("Вы сняли: " + bankAccount.withdraw(0));

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        //bankAccount.balance=100000; нельзя напрямую изменить извне!
        System.out.println("Ваш баланс: " + bankAccount.getBalance());


        //✅ Задание 4: Только для записи
        //Создайте класс Logger с приватным полем logLevel.
        //Добавьте только сеттер для этого поля (без геттера), чтобы можно было установить уровень логирования, но нельзя было его узнать извне.
        //
        //✅ Задание 5: Только для записи
        //Создайте класс Logger с приватным полем logLevel.
        //Добавьте только сеттер для этого поля (без геттера), чтобы можно было установить уровень логирования, но нельзя было его узнать извне.
        //
        //
        //✅ Задание 6: Изменяемость объекта
        //Создайте класс UserProfile с приватными полями: username (строка), email (строка), password (строка).
        //Добавьте геттеры и сеттеры.
        //Добавьте валидацию:
        //
        //email должен содержать символ @
        //
        //password должен быть не короче 8 символов.
        //Если проверка не проходит — данные не изменяются, а выводится сообщение об ошибке.
    }
}

class BankAccount {

    private double balance = 0;


    public double deposit(int money) {
        if (money <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной!");
        }
        balance = balance + money;
        return balance;
       // System.out.println("Вы пополнили баланс на " + money + " рублей");
    }

    public double withdraw(int money) {
        if (money <= 0) {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной!");
        }
        if (money > balance) {
            throw new IllegalArgumentException("Недостаточно средств!");
        }
        balance = balance - money;
        return balance;
       // System.out.println("Вы сняли с баланса " + money + " рублей");

    }

    public double getBalance() {
        return balance;
    }
}

class Person {
    private int age = 30;
    private String name = "Дмитрий";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100)
            this.age = age;
        else System.out.println("Некорректное значение!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

