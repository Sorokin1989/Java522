package LessonsTest;

enum Color {
    RED, GREEN, BLUE, WHITE
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


//
//
//class Person {
//   private String name;
//   private PositionType positionType;
//
//    public Person(String name, PositionType positionType) {
//        this.name = name;
//        this.positionType = positionType;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public PositionType getPositionType() {
//        return positionType;
//    }
//
//    public void setPositionType(PositionType positionType) {
//        this.positionType = positionType;
//    }
//}

//enum PositionType {
//    TEACHER, STUDENT, PARENT
//}


//
//class Student {
//    int age;
//    String name;
//
//    public Teacher convertToTeacher() {
//        Teacher teacher=new Teacher();
//        teacher.name=this.name;
//        teacher.age=this.age;
//        return teacher;
//    }
//
//}
//
//class Teacher {
//    int age;
//    String name;
//
//}
//

enum Move {
    UP("W"), DOWN("S"), LEFT("A"), RIGHT("D");

    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    Move(String direction) {
        this.direction = direction;


    }
}



public class LessonTest3 {
    public static void main(String[] args) {

        System.out.println(Move.UP.getDirection());
        System.out.println(Move.DOWN.getDirection());
        System.out.println(Move.LEFT.getDirection());
        System.out.println(Move.RIGHT.getDirection());







//        Student student=new Student();
//        student.age=36;
//        student.name="Dima";
//
//        Teacher teacher=student.convertToTeacher();
//        System.out.println(teacher.name + " " + teacher.age);

//        Person person1=new Person("Dima",PositionType.STUDENT);// студент
//        Person person2=new Person("Farid",PositionType.TEACHER);// учитель
//
//        person1.setPositionType(PositionType.TEACHER);
//
//        System.out.println(person1.getPositionType());
//        System.out.println(person2.getPositionType());









//        enum Move {
//            UP, DOWN, LEFT,RIGHT
//        }


//        Day day=Day.MONDAY;
//        System.out.println(day.ordinal());
//        System.out.println(day.name());
//        System.out.println(day);
//        System.out.println(Day.MONDAY);

//
//        System.out.println(day.compareTo(Day.SATURDAY));
//
//        for (int i = 0; i < Day.values().length; i++) {
//            System.out.print(Day.values()[i] + " ");
//
//        }

//        System.out.println(Day.values());
//        Day day=Day.FRIDAY;
//        System.out.println(day.ordinal());
//        Day day=Day.FRIDAY;
//String str=" ";
//if (day==Day.FRIDAY) {
//    System.out.println(" ");
//}
//        String str="MONDAY";
//        Day day=Day.MONDAY;
//
//        Day selected=Day.valueOf(str);
//
//        if (day==selected) {
//            System.out.println("This is MONDAY");
//        }





//        Color color = Color.WHITE;
//        if (color == Color.BLUE) {
//            System.out.println("This is BLUE");
//        } else if (color == Color.RED) {
//            System.out.println("This is RED");
//        } else if (color == Color.GREEN) {
//            System.out.println("This is GREEN");
//        } else if (color == Color.WHITE) {
//            System.out.println("This is WHITE");
//        }
    }
}









