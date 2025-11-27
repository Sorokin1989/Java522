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
//enum Weekday {
//    MONDAY(false), TUESDAY(false), WEDNESDAY(false),
//    THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);
//   private final boolean flag;
//
//    Weekday(boolean flag) {
//        this.flag = flag;
//    }
//
//    public boolean isWeekend() {
//        return flag;
//    }
//}

//enum CardSuit {
//    Червы("red"), Бубны("red"), Трефы("black"), Пики("black");
//    final String color;
//
//    CardSuit(String color) {
//        this.color = color;
//    }
//
//    public String getColor() {
//        return color;
//    }
//}

//enum TrafficLightColor {
//    Красный(30), Желтый(5), Зеленый(25);
//
//    int timeSecond;
//
//    TrafficLightColor(int timeSecond) {
//        this.timeSecond = timeSecond;
//    }
//
//    public int getTimeSecond() {
//        return timeSecond;
//    }
//
//    public TrafficLightColor getNext() {
//        switch (this) {
//            case Красный -> {
//                return Зеленый;
//            }
//            case Зеленый -> {
//                return Желтый;
//            }
//            case Желтый -> {
//                return Красный;
//            }
//            default -> throw new IllegalArgumentException("Некорректное значение!");
//        }
//
//    }
//}


//enum Season {
//    WINTER(-20), SPRING(+15), SUMMER(+25), AUTUMN(+10);
//    int t;
//
//    Season(int t) {
//        this.t = t;
//    }
//
//    public boolean isWarm() {
//        if (t > 15) {
//            return true;
//        } else return false;
//    }
//}


//enum CardRank {
//    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
//    SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11),
//    QUEEN(12), KING(13), ACE(14);
//    final int number;
//
//    CardRank(int number) {
//        this.number = number;
//    }
//
//    public boolean isFaceCard() {
//        switch (this) {
//            case JACK, QUEEN, KING -> {
//                return true;
//            }
//            default -> {
//                return false;
//            }
//        }
//    }
//}


//enum PaymentMethod {
//    CREDIT_CARD(1000, 10000), PAYPAL(1500, 15000),
//    BANK_TRANSFER(2500, 25000);
//
//   private final double minLimit;
//    private final double maxLimit;
//
//    PaymentMethod(double minLimit, double maxLimit) {
//        this.minLimit = minLimit;
//        this.maxLimit = maxLimit;
//    }
//
//    @Override
//    public String toString() {
//        return "PaymentMethod{" +
//                "minLimit=" + minLimit +
//                ", maxLimit=" + maxLimit +
//                '}';
//    }
//
//    boolean canPay(double amount) {
//
//        return amount <= maxLimit && amount >= minLimit;
//    }
//}


//enum ErrorSeverity {
//    LOW(1,"Начальный"), MEDIUM(2,"Средний"),
//    HIGH(3,"Высокий"), CRITICAL(4,"Мега");

//    private final   int priority;
//    private final String description;
//
//    ErrorSeverity(int priority, String description) {
//        this.priority = priority;
//        this.description = description;
//    }

//    public  boolean shouldAlert() {
//        return this == HIGH || this == CRITICAL;
//    }
//
//}
//


//enum Color {
//    RED("#FF0000"), GREEN("#00FF00"), BLUE("#00B7EB");
//
//    private final String codColor;
//
//    Color(String codColor) {
//        this.codColor = codColor;
//    }
//
//    public  String getHexCode() {
//        switch (this) {
//            case RED, GREEN, BLUE -> {
//                return codColor;
//            }
//            default -> throw new IllegalArgumentException("Некорректное значение");
//
//        }

//    }
//}
//enum OrderStatus {
//    PENDING, PROCESSING, SHIPPED, DELIVERED;
//
//    public boolean isFinal() {
//        return this == OrderStatus.SHIPPED || this == OrderStatus.DELIVERED;
//    }
//
//
//
//}

import java.util.Objects;

enum FileType {
    TEXT("txt",1), IMAGE("jpeg",5),
    VIDEO("mp4",100), AUDIO("mp3",10), ARCHIVE("zip",3);
    private  String extension;
    private int maxSizeMB;

    FileType(String extension, int maxSizeMB) {
        this.extension = extension;
        this.maxSizeMB = maxSizeMB;
    }

    public boolean isSupportedExtension(String extension) {
        return Objects.equals(this.extension, extension);
    }
}


public class LessonTest3 {
    public static void main(String[] args) {

        FileType fileType=FileType.ARCHIVE;

        System.out.println(fileType.isSupportedExtension("mp3"));


        //ЗАДАНИЕ 5: Типы файлов и их свойства
        //
        //Создайте enum FileType с типами: TEXT, IMAGE, VIDEO, AUDIO, ARCHIVE.
        //Каждому типу присвойте поля: extension (расширение файла), maxSizeMB (максимальный размер файла в мегабайтах).
        //Добавьте метод isSupportedExtension(String ext) для проверки, подходит ли расширение для данного типа.





//
//        OrderStatus orderStatus=OrderStatus.PROCESSING;
//
//        System.out.println(orderStatus.isFinal());

    //   ЗАДАНИЕ 3: Статусы заказа

    //   Создайте enum OrderStatus с статусами: PENDING, PROCESSING, SHIPPED, DELIVERED.
    //           Добавьте метод isFinal(), который возвращает true,
        //           если статус является конечным (SHIPPED или DELIVERED).



//        Color color=Color.RED;
//        Color color1=Color.GREEN;
//        Color color2=Color.BLUE;
//
//        System.out.println(color.getHexCode());
//        System.out.println(color1.getHexCode());
//        System.out.println(color2.getHexCode());

//        for (ErrorSeverity errorSeverity: ErrorSeverity.values())
//            System.out.println(errorSeverity + " " + errorSeverity.shouldAlert());

//        PaymentMethod paymentMethod = PaymentMethod.CREDIT_CARD;
//        PaymentMethod paymentMethod1 = PaymentMethod.PAYPAL;
//        PaymentMethod paymentMethod2 = PaymentMethod.BANK_TRANSFER;
//
//        System.out.println(paymentMethod.canPay(1500));
//        System.out.println(paymentMethod1.canPay(1500));
//        System.out.println(paymentMethod2.canPay(1500));
//
//        System.out.println(paymentMethod);


//        for (CardRank cardRank : CardRank.values())
//            System.out.println(cardRank + " " + cardRank.isFaceCard());

//        for (Season season : Season.values())
//            System.out.println(season + " " + season.isWarm());

//        for (TrafficLightColor trafficLightColor: TrafficLightColor.values())
//            System.out.println(trafficLightColor + " " +  trafficLightColor.getNext());


//        for (CardSuit cardSuit: CardSuit.values())
//            System.out.println(cardSuit + " " + cardSuit.getColor());;


//        for (Weekday weekday : Weekday.values()) {
//            System.out.println(weekday + " " + weekday.isWeekend());
//        }

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