package LessonsTest;


enum Direction {
    NORTH, SOUTH, EAST, WEST;
}

class Robot {
    Direction direction;

    public Robot() {
        this.direction = Direction.NORTH;
    }

    public void turnLeft() {
        if (Direction.NORTH == direction) {
           direction= Direction.WEST;
        } else if (Direction.WEST == direction) {
            direction=Direction.SOUTH;
        } else if (Direction.SOUTH == direction) {
           direction=Direction.EAST;
        } else if (Direction.EAST == direction) {
           direction=Direction.NORTH;
        } else  return;

    }

    public void turnRight() {
        if (Direction.NORTH == direction) {
            direction=Direction.EAST;
        } else if (Direction.EAST == direction) {
           direction= Direction.SOUTH;
        } else if (Direction.SOUTH == direction) {
          direction= Direction.WEST;
        } else if (Direction.WEST == direction) {
         direction= Direction.NORTH;
        } else return;
    }

    public Direction getDirection() {
        return direction;
    }
}

public class LessonTest3 {
    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println(robot.getDirection());
        robot.turnRight();
        System.out.println(robot.getDirection());
        robot.turnRight();
        robot.turnRight();
        System.out.println(robot.getDirection());
        robot.turnLeft();
        System.out.println(robot.getDirection());
        robot.turnLeft();
        System.out.println(robot.getDirection());



    }
}