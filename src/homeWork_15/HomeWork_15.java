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
//         str.toLowerCase()
//         charAt(10)
//         isEmpty()
//         isBlank()

        String str = "Dmitrii";

        System.out.println(str.length());
        char[] arr = {'D', 'm', 'i', 't','r','i','i'};
        System.out.println(length(arr));

        char symb = 'i';
        System.out.println(str.indexOf('i', 4));
        System.out.println(myIndexOf(arr, symb));


    }

    public static int length(char[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
        return arr.length;
    }

    public static int myIndexOf(char[] arr, char symb) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symb && i>=4)
                return i;

        }
        return -1;
    }
}
