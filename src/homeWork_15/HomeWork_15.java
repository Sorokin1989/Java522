package homeWork_15;

public class HomeWork_15 {
    public static void main(String[] args) {

        //        public static int length(char[] str)
//        public static int myIndexOf(char[] str,char symb)
//        public static int lastIndexOf(char[] str,char symb)
//        public static int lastIndexOf(char[] str,char symb,int beginIndex)
//        public static char[] myToUpperCase( char[] str)
//        public static char[] toLowerCase( char[] str)
//        public static char charAt( char[] str,int index)
//        public static boolean isEmpty( char[] str)
//        public static boolean isBlank( char[] str)

//         str.length()
//         str.indexOf('a',5)
//         str.lastIndexOf('a')
//         str.lastIndexOf('a',5)
//         charAt(10)
//         str.toLowerCase()
//         isEmpty()
//         isBlank()

        String str = "DMITRII";

        System.out.println(str.length());
        char[] arr = { 'D','M','I', 'T', 'R', 'I', 'I'};
        System.out.println(length(arr));

        char symb = 'a';
        System.out.println(str.indexOf('a', 4));
        System.out.println(myIndexOf(arr, symb));

        System.out.println(str.lastIndexOf('a'));
        System.out.println(lastIndexOf(arr, 'a'));

        System.out.println(str.lastIndexOf('i', 3));
        System.out.println(lastIndexOf(arr, 'i', 3));


        System.out.println(str.charAt(5));
        System.out.println(charAt(arr, 5));

        System.out.println(str.toLowerCase());
        System.out.println(toLowerCase(arr));

        System.out.println(str.isEmpty());
        System.out.println(isEmpty(arr));


    }

    public static int length(char[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
        return arr.length;
    }

    public static int myIndexOf(char[] arr, char symb) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symb && i >= 4)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char symb) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == symb)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char symb, int beginIndex) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == symb && beginIndex >= i)
                return i;
        }
        return -1;
    }


    public static char charAt(char[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index)
                return arr[i];
        }
        return ' ';
    }

    public static char[] toLowerCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 64 && arr[i] < 91) {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        return arr;
    }

    public static boolean isEmpty(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ')
                return true;
        }
        return false;
    }

}
