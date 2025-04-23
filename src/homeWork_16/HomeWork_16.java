package homeWork_16;

import java.util.Arrays;

public class HomeWork_16 {
    public static void main(String[] args) {
        //        -     equals("Farid"));
//        -     endsWith("dlayev"));
//        -     startsWith("Abdullayev"));
//        -     replace('F','Z'));

//        -     toCharArray());
//        -     equalsIgnoreCase("Farid"));
//        -     substring(10));
//        -     substring(10,20));
//        +     trim());

//        -     contains("  "));
//        -     split("Farid"));
//        -     replace("Farid","Dima"));

        String str1 = "Dmitrii";
        String str2 = "Dmitrii";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println(str1.equals(str2));
        System.out.println(myEquals(arr1, arr2));

    }

    public static boolean myEquals(char[] str1, char[] str2) {
        char[] arr1 = new char[str1.length];
        char[] arr2 = new char[str2.length];
        for (int i = 0; i < str1.length; i++) {

        }
        for (int i = 0; i < str2.length; i++) {

        }
        if (Arrays.equals(arr1, arr2))
            return true;
        else return false;
    }


}
