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

interface Testable{
    String test();
}
abstract class Test2 {
 abstract void test();

}

public class LessonTest_4 {
    public static void main(String[] args) {

        Test2 test2=new Test2() {
            @Override
            void test() {
                System.out.println("frewyeythdj");
            }
        };

        test2.test();

        Testable testable=()-> "Hello";
        System.out.println(testable.test());
//        Printable printable = (x) -> System.out.println(x);
//
//        printable.print(1);
//        printable.print("Dima");
//        printable.print('e');
//        printable.print(true);


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
