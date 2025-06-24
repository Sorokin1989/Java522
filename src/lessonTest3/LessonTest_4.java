package lessonTest3;

//
//interface Printable {
//    void print(String str);
//}
//
//class Test2 implements Printable {
//
//    @Override
//    public void print(String str) {
//        System.out.println(str);
//
//    }
//}

//interface Operationable {
//    int calculate(int x, int y);
//
//}
//interface Printable<T> {
//    void print(T str);
//
//}
//interface Printable<T> {
//   //void print2(T str);
//
//    void print(T str);
//
//
//}

//interface Testable{
//    String test();
//}
//abstract class Test2 {
// abstract void test();
//
//}

public class LessonTest_4 {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrChet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }


    public static void printArrNeChet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void printArrMoreThen(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrLessThen(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrEqualsThen(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrTo2To3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0 && arr[i]%3==0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArr(arr);
        printArrChet(arr);
        printArrNeChet(arr);
        printArrMoreThen(arr,5);
        printArrLessThen(arr,5);
        printArrEqualsThen(arr,5);
        printArrTo2To3(arr);


//        Test2 test2=new Test2() {
//            @Override
//            void test() {
//                System.out.println("frewyeythdj");
//            }
//        };
//
//        test2.test();
//
//        Testable testable=()-> "Hello";
//        System.out.println(testable.test());
////        Printable printable = (x) -> System.out.println(x);
////
////        printable.print(1);
////        printable.print("Dima");
////        printable.print('e');
////        printable.print(true);


//        Operationable sum=(x,y)->
//        {
//           int rezult= x + y;
//           rezult*=rezult;
//           return rezult;
//        };
//        Operationable raznost=(x,y)->x-y;
//        Operationable umnogenie=(x,y)->x*y;
//        Operationable delenie=(x,y)->x/y;
//
//        System.out.println(sum.calculate(10,5));
//        System.out.println(raznost.calculate(10,5));
//        System.out.println(umnogenie.calculate(10,5));
//        System.out.println(delenie.calculate(10,5));


//        Test2 test2 = new Test2();
//        test2.print("Dima");

//        Printable printable=new Printable() {
//            @Override
//            public void print(String str) {
//                System.out.println(str);
//            }
//        };
//
//        printable.print("Dima");

//        Printable printable=(str)->{
//            System.out.println(str);
//            System.out.println(str);
//            System.out.println(str);
//            System.out.println(str);
//            System.out.println(str);
//        };
//        printable.print("Dima");
    }
}
