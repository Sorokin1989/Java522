package homeWork_25;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekend() {
        return this == Day.SATURDAY || this == Day.SUNDAY;
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
        //
        //
        //ЗАДАНИЕ 3: Уровень приоритета задач
        //Цель: создать enum Priority с уровнями LOW, MEDIUM, HIGH, CRITICAL.
        //У каждого должен быть числовой код приоритета.
        //
        //
        //
        //ЗАДАНИЕ 4: Направления движения
        //Цель: создать enum Direction с направлениями NORTH, SOUTH, EAST, WEST.
        //Добавь метод opposite() — возвращает противоположное направление.
        //
        //
        //ЗАДАНИЕ 5: Статус заказа
        //Цель: создать enum OrderStatus с этапами заказа: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
        // Добавь метод canChangeTo(OrderStatus newStatus) — можно ли перейти в другой статус.
    }
}
