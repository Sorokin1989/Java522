package LessonsTest;

enum Color {
    RED, GREEN, BLUE, WHITE
}


public class LessonTest3 {
    public static void main(String[] args) {
        Color color = Color.WHITE;
        if (color == Color.BLUE) {
            System.out.println("This is BLUE");
        } else if (color == Color.RED) {
            System.out.println("This is RED");
        } else if (color == Color.GREEN) {
            System.out.println("This is GREEN");
        } else if (color == Color.WHITE) {
            System.out.println("This is WHITE");
        }
    }
}









