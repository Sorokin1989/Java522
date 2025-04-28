package homeWork_17;

public class HomeWork_17 {
    public static void main(String[] args) {

//        +     trim()); Делали на уроке

//        -     contains("  "));
//        -     split("Farid"));
//        -     replace("Farid","Dima"));

        String str1 = "      Dmitrii Sorokin      ";
        String str2 = "Dmitrii sorokin";
        String suff = "trii";



        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] newSuff=suff.toCharArray();



        System.out.println(str1.trim());
        System.out.println(myTrim(arr1));

        System.out.println(str1.contains("trii"));
        System.out.println(myContains(arr1,newSuff));


    }

    public static char[] myTrim(char[] str) {
        int start = 0;
        int end = str.length - 1;

        // сначала ищем первый не пробельный символ
        while (start <= end && Character.isWhitespace(str[start])) {
            start++;
        }

        // потом ищем последний не пробельный символ
        while (end >= start && Character.isWhitespace(str[end])) {
            end--;
        }

        if (start > end) {
            return new char[0];
        }

        char[] arr1 = new char[end - start + 1];

        for (int i = start; i <= end; i++) {
            arr1[i - start] = str[i];
        }

        return arr1;

    }
    public  static boolean myContains(char[] str1, char[] suff ) {
        if (suff.length == 0) {
            return true;
        }

        if (str1.length < suff.length) {
            return false;
        }

        for (int i = 0; i <= str1.length - suff.length; i++) {
            boolean found = true;
            for (int j = 0; j < suff.length; j++) {
                if (str1[i + j] != suff[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
    }

