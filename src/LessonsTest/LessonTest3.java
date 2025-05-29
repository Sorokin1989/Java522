package LessonsTest;

enum Color {
    RED, GREEN, BLUE, WHITE
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}




class Person {
    String name;
    PositionType positionType;

    public Person(String name, PositionType positionType) {
        this.name = name;
        this.positionType = positionType;
    }

    public Person(String name) {
        this.name = name;
    }
}

enum PositionType {
    TEACHER, STUDENT, PARENT
}

public class LessonTest3 {
    public static void main(String[] args) {

        Person person1=new Person("Dima",PositionType.STUDENT);// студент
        Person person2=new Person("Farid",PositionType.TEACHER);// учитель

        System.out.println(person1.name + person1.positionType);
        System.out.println(person2.name + person2.positionType);







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









