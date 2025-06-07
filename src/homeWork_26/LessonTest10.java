package homeWork_26;


public class LessonTest10 {
    int size;
    int[] arr;

    {
        size = 0;
        arr = new int[size];
    }

    public int[] addEnd(int value) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[size] = value;
        arr = temp;
        size++;
        return arr;
    }

    public void insertAt(int index, int value) {
        int[] tmp = new int[arr.length + 1];


        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[index] = value;

        for (int i = index; i < arr.length; i++) {
            tmp[i + 1] = arr[i];

        }
        arr = tmp;
        size++;
    }

    public void insertMiddle(int value) {
        int[] tmp = new int[arr.length + 1];

        int middleIndex = (arr.length) / 2;

        for (int i = 0; i < middleIndex; i++) {
            tmp[i] = arr[i];
        }
        tmp[middleIndex] = value;


        for (int i = middleIndex; i < arr.length; i++) {
            tmp[i + 1] = arr[i];
        }
            arr = tmp;
            size++;
        }


        public void print () {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");

            }
        }


        public static void main (String[]args){

            //Задание 1: Вставить элемент в конец массива
            //Напишите метод addEnd(int value), который добавляет элемент value в конец массива arr.
            LessonTest10 lessonTest10 = new LessonTest10();
            lessonTest10.addEnd(10);
            lessonTest10.addEnd(20);
            lessonTest10.addEnd(30);
            lessonTest10.addEnd(45);
            lessonTest10.addEnd(99);
           lessonTest10.addEnd(44);


            lessonTest10.insertAt(2, 50);
            lessonTest10.insertAt(4, 1000);

            lessonTest10.insertMiddle(7);


            lessonTest10.print();


            //Задание 2: Вставить элемент в произвольную позицию
            //Напишите метод insertAt(int index, int value),
            // который вставляет элемент value на позицию index в массиве arr.
            // Не забудьте проверить корректность индекса.

            //Задание 3: Вставить несколько элементов в начало массива
            //Создайте метод addMultipleStart(int[] values),
            // который вставляет массив values в начало массива arr.

            //Задание 5: Вставить элемент в середину массива
            //Создайте метод insertMiddle(int value),
            // который вставляет число value ровно посередине массива.
            // Если длина массива нечётная, вставляйте чуть левее центра.


        }
    }
