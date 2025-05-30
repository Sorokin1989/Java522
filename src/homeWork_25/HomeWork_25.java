package homeWork_25;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekend() {
        return this == Day.SATURDAY || this == Day.SUNDAY;
    }

}

enum Currency {
    USD(78.5), EUR(89.0), RUB(1);

    private double rateToRUB;

    Currency(double rateToRUB) {
        this.rateToRUB = rateToRUB;
    }

    double toRuble(double amount) {
        return amount * rateToRUB;

    }

}

enum Priority {
    LOW(25), MEDIUM(50), HIGH(75), CRITICAL(100);
    final int levelCode;

    Priority(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }
}

enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public Direction opposite() {
        if (this == NORTH) {
            return SOUTH;
        } else if (this == SOUTH) {
            return NORTH;
        } else if (this == EAST) {
            return WEST;
        } else if (this == WEST) {
            return EAST;
        } else return this;

    }
}

enum OrderStatus {
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED;

    boolean canChangeTo(OrderStatus newStatus) {

        if (this == NEW) {
            return newStatus == PROCESSING || newStatus == CANCELLED;
        } else if (this == PROCESSING) {
            return newStatus == SHIPPED || newStatus == CANCELLED;
        } else if (this == SHIPPED) {
            return newStatus == DELIVERED;
        } else if (this == DELIVERED) {
            return false;
        } else if (this == CANCELLED) {
            return false;
        } else return false;
    }
}


public class HomeWork_25 {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1: Дни недели и рабочие дни
        //Цель: создать enum Day, который определяет дни недели.
        //Добавь метод isWeekend(), который возвращает true, если день — выходной (суббота или воскресенье).
        //
        Day day = Day.SUNDAY;
        System.out.println(day.isWeekend());

        //
        //ЗАДАНИЕ 2: Курс валют
        //Цель: создать enum Currency с валютами (USD, EUR, RUB) и их курсом к рублю.
        //Добавь метод toRuble(double amount).

        Currency currency = Currency.USD;
        System.out.println(currency.toRuble(100));

        //currency.toRuble(10000);


        //
        //
        //ЗАДАНИЕ 3: Уровень приоритета задач
        //Цель: создать enum Priority с уровнями LOW, MEDIUM, HIGH, CRITICAL.
        //У каждого должен быть числовой код приоритета.
        //
        Priority priority = Priority.HIGH;
        System.out.println(priority.getLevelCode());


        //
        //
        //ЗАДАНИЕ 4: Направления движения
        //Цель: создать enum Direction с направлениями NORTH, SOUTH, EAST, WEST.
        //Добавь метод opposite() — возвращает противоположное направление.
        //
        Direction direction = Direction.EAST;
        System.out.println(direction.opposite());


        //
        //ЗАДАНИЕ 5: Статус заказа
        //Цель: создать enum OrderStatus с этапами заказа: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
        // Добавь метод canChangeTo(OrderStatus newStatus) — можно ли перейти в другой статус.

        OrderStatus orderStatus = OrderStatus.NEW;
        System.out.println(orderStatus.canChangeTo(OrderStatus.SHIPPED));
    }
}
