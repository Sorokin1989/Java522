package homeWork_16;

import java.util.Arrays;

public class HomeWork_16 {
    public static void main(String[] args) {
        //        +     equals("Farid"));
//        +     endsWith("dlayev"));
//        +     startsWith("Abdullayev"));
//        +     replace('F','Z'));

//        +     toCharArray());
//        +     equalsIgnoreCase("Farid"));
//        +     substring(10));
//        -     substring(10,20));
//        +     trim());

//        -     contains("  "));
//        -     split("Farid"));
//        -     replace("Farid","Dima"));

        String str1 = "Dmitrii Sorokin";
        String str2 = "Dmitrii sorokin";
        String suffix = "okin";
        String prefix = "DmitR";


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] suff = suffix.toCharArray();
        char[] pref = prefix.toCharArray();

        System.out.println(str1.equals(str2));
        System.out.println(myEquals(arr1, arr2));

        System.out.println(str1.endsWith("okin"));
        System.out.println(myEndsWith(arr1, suff));

        System.out.println(str1.startsWith("DmitR"));
        System.out.println(myStartsWith(arr1, pref));


        System.out.println(str1.replace('D', 'F'));
        System.out.println(myReplace(arr1, 'D', 'F'));


        System.out.println(str1.toCharArray());
        System.out.println(myToCharArray(str1));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(myEqualsIgnoreCase(arr1, arr2));

        System.out.println(str1.substring(10));
        System.out.println(mySubstring(arr1, 10));

        System.out.println(str1.substring(5, 10));
        System.out.println(mySubstring(arr1, 5, 10));


    }

    public static boolean myEquals(char[] arr1, char[] arr2) {
        if (Arrays.equals(arr1, arr2))
            return true;
        else return false;
    }

    public static boolean myEndsWith(char[] str1, char[] suffix) {
        int strLength = str1.length;
        int suffixLength = suffix.length;

        if (suffixLength > strLength) {
            return false;
        }

        for (int i = 0; i < suffixLength; i++) {
            if (str1[strLength - suffixLength + i] != suffix[i]) {
                return false;
            }
        }

        return true;

    }

    public static boolean myStartsWith(char[] str1, char[] prefix) {
        int strLength = str1.length;
        int prefixLength = prefix.length;
        if (prefixLength > strLength)
            return false;

        for (int i = 0; i < prefixLength; i++) {
            if (str1[i] != prefix[i]) {
                return false;
            }
        }

        return true;


    }

    public static char[] myReplace(char[] str1, char oldChar, char newChar) {
        char[] arr1 = new char[str1.length];
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] == oldChar) {
                arr1[i] = newChar;
            } else {
                arr1[i] = str1[i];
            }

        }
        return arr1;
    }

    public static char[] myToCharArray(String str1) {
        char[] arr1 = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
        }
        return arr1;
    }

    public static boolean myEqualsIgnoreCase(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (Character.toLowerCase(arr1[i]) != Character.toLowerCase(arr2[i]))
                return false;
        }
        return true;
    }

    public static char[] mySubstring(char[] str1, int beginIndex) {
        int newLength = str1.length - beginIndex;
        char[] arr1 = new char[newLength];
        for (int i = beginIndex; i < str1.length; i++) {
            arr1[i - beginIndex] = str1[i];
        }
        return arr1;

    }

    public static char[] mySubstring(char[] str1, int beginIndex, int endIndex) {
        int newLength = endIndex - beginIndex;
        char[] arr1 = new char[newLength];
        for (int i = beginIndex; i < endIndex; i++) {
            arr1[i - beginIndex] = str1[i];
        }
        return arr1;

    }
}









