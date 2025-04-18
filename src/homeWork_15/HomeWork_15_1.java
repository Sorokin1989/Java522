package homeWork_15;

public class HomeWork_15_1 {
    public static void main(String[] args) {
        String str2 = " ";

        char[] arr2 = str2.toCharArray();


        System.out.println(str2.isEmpty());
        System.out.println(isEmpty(arr2));
        System.out.println(str2.isBlank());
        System.out.println(isBlank(arr2));


    }

    public static boolean isEmpty(char[] arr2) {
        for (int i = 0; i <= arr2.length; i++) {
            if (arr2.length == 0)
                return true;
        }
        return false;
    }

    public static boolean isBlank(char[] arr2) {
       if (arr2.length==0)
           return true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]!=' ')
                return false;
        }
                return true;

        }

    }



