package LessonsTest;


//enum Direction {
//    NORTH, SOUTH, EAST, WEST;
//}
//
//class Robot {
//    Direction direction;
//
//    public Robot() {
//        this.direction = Direction.NORTH;
//    }
//
//    public void turnLeft() {
//        if (Direction.NORTH == direction) {
//           direction= Direction.WEST;
//        } else if (Direction.WEST == direction) {
//            direction=Direction.SOUTH;
//        } else if (Direction.SOUTH == direction) {
//           direction=Direction.EAST;
//        } else if (Direction.EAST == direction) {
//           direction=Direction.NORTH;
//        } else  return;
//
//    }
//
//    public void turnRight() {
//        if (Direction.NORTH == direction) {
//            direction=Direction.EAST;
//        } else if (Direction.EAST == direction) {
//           direction= Direction.SOUTH;
//        } else if (Direction.SOUTH == direction) {
//          direction= Direction.WEST;
//        } else if (Direction.WEST == direction) {
//         direction= Direction.NORTH;
//        } else return;
//    }
//
//    public Direction getDirection() {
//        return direction;
//    }
//}


//enum Direction {
//    NORTH, SOUTH, EAST, WEST, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST;
//
//    public Direction opposite() {
//        switch (this) {
//            case NORTH -> {
//                return SOUTH;
//            }
//            case SOUTH -> {
//                return NORTH;
//            }
//            case WEST -> {
//                return EAST;
//            }
//            case EAST -> {
//                return WEST;
//            }
//            case NORTHEAST -> {
//                return SOUTHWEST;
//            }
//            case SOUTHEAST -> {
//                return NORTHWEST;
//            }
//            case SOUTHWEST -> {
//                return NORTHEAST;
//            }
//            case NORTHWEST -> {
//                return SOUTHEAST;
//            }
//            default -> throw new IllegalStateException("Unexpected direction: " + this);
//        }
//    }
//
//
//}
//

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;


}
class WeatherForecast {
    Season season;

    public WeatherForecast(Season season) {
        this.season = season;
    }


    String getAverageTemperature() {
        switch (season) {
            case AUTUMN -> {
                return "+15";
            }
            case WINTER -> {
                return "-15";
            }
            case SPRING -> {
                return "+10";
            }
            case SUMMER -> {
                return "+25";
            }
            default -> {
                throw new IllegalArgumentException("Некорректное значение");
            }
        }

    }
}


public class LessonTest3 {
    public static void main(String[] args) {

        WeatherForecast weatherForecast=new WeatherForecast(Season.SPRING);
        System.out.println(weatherForecast.getAverageTemperature());

//        Direction direction = Direction.NORTHEAST;
//        System.out.println(direction.opposite());

//        Robot robot = new Robot();
//        System.out.println(robot.getDirection());
//        robot.turnRight();
//        System.out.println(robot.getDirection());
//        robot.turnRight();
//        robot.turnRight();
//        System.out.println(robot.getDirection());
//        robot.turnLeft();
//        System.out.println(robot.getDirection());
//        robot.turnLeft();
//        System.out.println(robot.getDirection());


    }
}