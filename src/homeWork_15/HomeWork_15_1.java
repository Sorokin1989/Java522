package homeWork_15;

public class HomeWork_15_1 {
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
        char[] arr = str.toCharArray();


       String str2 = " ";                        // переменные для методов isEmpty() и isBlank()
       char[] arr2 = str2.toCharArray();         // переменные для методов isEmpty() и isBlank()


     System.out.println(str.length());
     System.out.println(myLength(arr));

     char symb = 'I';
     System.out.println(str.indexOf('I', 4));
     System.out.println(myIndexOf(arr, symb));

     System.out.println(str.lastIndexOf('D'));
     System.out.println(myLastIndexOf(arr, 'D'));

     System.out.println(str.lastIndexOf('I', 3));
     System.out.println(myLastIndexOf(arr, 'I', 3));


     System.out.println(str.charAt(3));
     System.out.println(myCharAt(arr, 3));


     System.out.println(str.toLowerCase());
     System.out.println(myToLowerCase(arr));



     System.out.println(str2.isEmpty());
     System.out.println(myIsEmpty(arr2));

     System.out.println(str2.isBlank());
     System.out.println(myIsBlank(arr2));

    }

  public static int myLength(char[] str) {
      char[] arr = new char[str.length];
      for (int i = 0; i < arr.length; i++) {

      }

     return arr.length;
  }

  public static int myIndexOf(char[] str, char symb) {
      char[] arr = new char[str.length];
      for (int i = 0; i < arr.length; i++) {
          if (str[i] == symb && i >= 4)
              return i;
      }
      return -1;
  }

  public static int myLastIndexOf(char[] str, char symb) {
      char[] arr = new char[str.length];
     for (int i = arr.length - 1; i >= 0; i--) {
          if (str[i] == symb)
              return i;
      }
      return -1;
  }

  public static int myLastIndexOf(char[] str, char symb, int beginIndex) {
      char[] arr = new char[str.length];
      for (int i = arr.length - 1; i >= 0; i--) {
         if (str[i] == symb && beginIndex >= i)
              return i;
      }
      return -1;
  }


  public static char myCharAt(char[] str, int index) {
      char[] arr = new char[str.length];
      for (int i = 0; i < arr.length; i++) {
          if (i == index)
              return str[i];
      }
      return ' ';
  }

    public static char[] myToLowerCase(char[] str) {
        char[] arr = new char[str.length];
        for (int i = 0; i < arr.length; i++) {
            if (str[i] >= 65 && str[i] <= 90) {
                arr[i] = (char) (str[i] + 32);
            } else {
                arr[i] = str[i];
            }
        }
        return arr;
    }

   public static boolean myIsEmpty(char[] str2) {
       char[] arr2 = new char[str2.length];
       for (int i = 0; i <= arr2.length; i++) {
           if (str2.length == 0)
               return true;
       }
       return false;
   }

  public static boolean myIsBlank(char[] str2) {
      char[] arr2 = new char[str2.length];
       if (str2.length == 0)
           return true;
       for (int i = 0; i < arr2.length; i++) {
           if (str2[i] != ' ')
               return false;
       }
       return true;

   }


}


