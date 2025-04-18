package lesson_2;

public class Animal {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.sum();
        b.sum();
    }
}
class A {
    int x = 5, y = 5;
    public void sum() {
        System.out.println(x + y);
    }
}
class B extends A {
}