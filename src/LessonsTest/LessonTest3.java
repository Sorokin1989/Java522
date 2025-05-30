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

//enum Move {
//    UP("W"), DOWN("S"), LEFT("A"), RIGHT("D");
//
//    private String direction;
//
//    public String getDirection() {
//        return direction;
//    }
//
//    public void setDirection(String direction) {
//        this.direction = direction;
//    }
//
//    Move(String direction) {
//        this.direction = direction;
//
//
//    }
//}
//
//enum Season {
//    winter("декабрь", "январь", "февраль"), spring("март", "апрель", "май"),
//    summer("июнь", "июль", "август"), autumn("сентябрь", "октябрь", "ноябрь");
//
//    private String oneM;
//    private String twoM;
//    private String threeM;
//
//    public String getOneM() {
//        return oneM;
//    }
//
//    public String getThreeM() {
//        return threeM;
//    }
//
//    public String getTwoM() {
//        return twoM;
//    }
//
//    Season(String oneM, String twoM, String threeM) {
//        this.oneM = oneM;
//        this.twoM = twoM;
//        this.threeM = threeM;
//
//
//    }
//}

enum Direction {
    UP(0, 1), DOWN(0, -1), LEFT(-1, 0), RIGHT(1, 0);

    private final int xStep, yStep;

    static int stepLength = 1;

    public static void setStepLength(int stepLength) {
        if (stepLength > 0) {
            Direction.stepLength = stepLength;
        }
    }

    Direction(int xStep, int yStep) {
        this.xStep = xStep;
        this.yStep = yStep;

    }

    public void step(Point point) {
        point.x += xStep * stepLength;

        point.y += yStep * stepLength;

    }
}

class Player {

    private String name;
    private Point point;
    private Direction direction;


    public Player(String name) {
        this.name = name;
        this.point = new Point(0, 0);
        // this.direction = Direction.UP;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {

        direction.step(point);
//        switch (direction) {
//            case UP -> this.point.y += 1;
//            case DOWN -> this.point.y -= 1;
//            case LEFT -> this.point.x -= 1;
//            case RIGHT -> this.point.x += 1;
//        }
    }

    @Override
    public String toString() {
        return name + " Location=" + point + "\n";
    }
}

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}


public class LessonTest3 {
    public static void main(String[] args) {


        Player player = new Player("Dima");
        player.setDirection(Direction.UP);
        Direction.setStepLength(20);
        player.move();
        player.setDirection(Direction.RIGHT);
        Direction.setStepLength(3);
        player.move();
        System.out.println(player);
        player.setDirection(Direction.UP);
        Direction.setStepLength(2);
        player.move();

        System.out.println(player);

//        System.out.println("Teleport");
//        player.setPoint(new Point(5, 5));
//        System.out.println(player);


        //  Player player=new Player("Dima");
        //  player.move(Direction.UP);
        //  player.move(Direction.UP);
        //  player.move(Direction.RIGHT);
        //  player.move(Direction.RIGHT);
        //  System.out.println(player);
//
        //  player.move(Direction.UP);
        //  player.move(Direction.UP);
        //  System.out.println(player);


//        System.out.println(Move.UP.getDirection());
//        System.out.println(Move.DOWN.getDirection());
//        System.out.println(Move.LEFT.getDirection());
//        System.out.println(Move.RIGHT.getDirection());
        //System.out.println(Season.autumn.getOneM() + " " + Season.autumn.getTwoM() + " " + Season.autumn.getThreeM());
        //System.out.println(Season.winter.getOneM() + " " + Season.winter.getTwoM() + " " + Season.winter.getThreeM());
        //System.out.println(Season.spring.getOneM() + " " + Season.spring.getTwoM() + " " + Season.spring.getThreeM());
        //System.out.println(Season.summer.getOneM() + " " + Season.summer.getTwoM() + " " + Season.summer.getThreeM());


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









