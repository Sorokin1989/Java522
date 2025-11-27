import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;
    int grade;
    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

class Group{
    String groupName;
    List<Student> students;

    public Group() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);

    }

    public void removeStudent(Student student){
        students.remove(student);

    }

    public Student searchStudent(String name){
        for(Student student : students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }


    public void printStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }
    public void printAvgGrade(){
        double avg = 0;
for(Student student : students){
    avg += student.getGrade();
}
avg /= students.size();
System.out.println("Avg Grade: " + avg);

    }
}




public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
// Создайте класс Student с полями name, age, grade
// Создайте класс Group с полями groupName, список студентов
// Реализуйте методы: добавить студента, удалить студента, найти студента по имени,
// посчитать средний балл группы

        Group group = new Group();

        Student student1=new Student("Дима",25,5);
        Student student2=new Student("Иван",35,4);
        Student student3=new Student("Петя",20,3);
        Student student4=new Student("Андрей",25,4);
        Student student5=new Student("Вадим",19,5);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);

//        group.printStudents();

//        group.removeStudent(student1);

        group.printStudents();

        group.printAvgGrade();



//Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Good");

        }catch (ClassNotFoundException e) {
            System.out.println("Error");
        }

    }
}