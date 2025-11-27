package LessonsTest;

public class LessonsTest4 {
    public static void main(String[] args) {
       // Personn personn=new Personn(25,"Дмитрий");
       // System.out.println(personn.getAge());
    Employee employee=new Employee("Дима");
    employee.test();

    }
}
//class Personn {
//    private int age;
//    private String name;
//
//    public Personn(int age, String name) {
//       // this.age=age;
//        this.setAge(age);
//        this.name=name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age>0) {
//            this.age = age;
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

//class  A {
//
//}
//class  B extends A {
//
//}
//class  C extends  A {
//
//}


class  Personn {
    int age;

    public Personn(int age) {
        this.age = age;
    }
    public void test() {
        System.out.println("Person");
    }
}

class Employee extends Personn {
    String name;

    public Employee(String name) {
        super(24);
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println("Employee");
    }
}
