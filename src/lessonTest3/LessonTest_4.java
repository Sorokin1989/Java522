package lessonTest3;

interface CounterCondition {
    boolean check(int num);
}

public class LessonTest_4 {
    public static void sumIf(int[] arr, CounterCondition condition) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (condition.check(arr[i])) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
        System.out.println();
    }


    public static void main(String[] args) {

        //  метод sumIf(int[] arr, CounterCondition condition):
        //
        //Найти сумму отрицательных чисел в массиве.
        //Пример условия: x -> x < 0

        int[] arr = {1, -1, -3, 4, -5, 7, 6, -4};

        sumIf(arr, (x) -> x < 0);


        //
        //Найти сумму чисел, делящихся на 3 без остатка.
        //Пример условия: x -> x % 3 == 0
        sumIf(arr, x -> x % 3 == 0);

        //
        //Найти сумму чисел, которые больше 10.
        //Пример условия: x -> x > 10

        sumIf(arr, x -> x > 10);
        //
        //Найти сумму чисел, оканчивающихся на четную цифру (0, 2, 4, 6, 8).
        //Пример условия: x -> Math.abs(x) % 10 % 2 == 0

        sumIf(arr, x -> Math.abs(x) % 10 % 2 == 0);
        //
        //Найти сумму чисел в диапазоне от 5 до 15 включительно.
        //Пример условия: x -> x >= 5 && x <= 15

        sumIf(arr, x -> x >= 5 && x <= 15);
        //
        //Найти сумму четных чисел.
        //Пример условия: x -> x % 2 == 0

        sumIf(arr,x -> x % 2 == 0);
        //
        //Найти сумму чисел, которые являются кратными 10.
        //Пример условия: x -> x % 10 == 0

        sumIf(arr,x -> x % 10 == 0);
        //
        //Найти сумму чисел, которые меньше или равны -5.
        //Пример условия: x -> x <= -5
        //

        sumIf(arr,x->x<=-5);
        //Найти сумму положительных чисел больше 20.
        //Пример условия: x -> x > 20
        sumIf(arr,x -> x > 20);
        //
        //Найти сумму чисел с нечетной цифрой в единицах (например, числа, оканчивающиеся на 1,3,5,7 или 9).
        //Пример условия: x -> Math.abs(x) % 10 % 2 != 0
        sumIf(arr,x -> Math.abs(x) % 10 % 2 != 0);

    }
}