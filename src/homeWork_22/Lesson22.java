package homeWork_22;

class Person {
    private String name;
    private int age;
    public static int count=1;
    private int id;

  // Person(int id) {
  //     this.id=id;

  // }

   // public Person() {

   // }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




public class Lesson22 {
    public static void main(String[] args) {
      Person p1=new Person("Farid",29,1);
      p1.count=10;
      Person p2=new Person("Oleg",34,2);
      p1.count=20;
      Person p3=new Person("Dasha",22,3);
      p1.count=30;
        Person.count=1;
        System.out.println(Person.count);



    }
}
