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

//enum Season {
//    WINTER, SPRING, SUMMER, AUTUMN;
//
//
//}
//class WeatherForecast {
//    Season season;
//
//    public WeatherForecast(Season season) {
//        this.season = season;
//    }
//
//
//    String getAverageTemperature() {
//        switch (season) {
//            case AUTUMN -> {
//                return "+15";
//            }
//            case WINTER -> {
//                return "-15";
//            }
//            case SPRING -> {
//                return "+10";
//            }
//            case SUMMER -> {
//                return "+25";
//            }
//            default -> throw new IllegalArgumentException("Некорректное значение");
//
//        }
//
//    }
//}

//enum Planet {
//    MERCURY(2440*1000,3.3e23), VENUS(6051.8*1000,4.87e24), EARTH(6371*1000,5.972e24 ), MARS(3390.6*1000,418e23);
//
//   public static final double G = 6.67430e-11;
//
//    private final double R;
//     private final double m;
//
//    Planet(double r, double m) {
//        this.R = r;
//        this.m = m;
//    }
//
//    double getSurfaceGravity() {
//        return G * m / (R*R);
//    }
//
//}
enum Weekday {
    MONDAY(false), TUESDAY(false), WEDNESDAY(false),
    THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);
   private final boolean flag;

    Weekday(boolean flag) {
        this.flag = flag;
    }

    public boolean isWeekend() {
        return flag;
    }
}


public class LessonTest3 {
    public static void main(String[] args) {


        for (Weekday weekday : Weekday.values()) {
            System.out.println(weekday + " " + weekday.isWeekend());
        }

//        for (Planet planet:Planet.values()) {
//            System.out.println(planet.name() + " " + planet.getSurfaceGravity());
//
//        }


//        WeatherForecast weatherForecast=new WeatherForecast(Season.SPRING);
//        System.out.println(weatherForecast.getAverageTemperature());

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