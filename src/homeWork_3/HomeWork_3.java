package homeWork_3;

public class HomeWork_3 {
    public static void main(String[] args) {

        //Задание_1

        int a = 5;
        a += 3;
        System.out.println(a);

        //Задание_2

        int b = 10;
        b -= 4;
        System.out.println(b);

        //Задание_3

        int x = 2;
        int y = 3;
        int sum = ++x + ++y;
        System.out.println(sum);

        //Задание_4

        int m = 8;
        int n = 5;
        m -= 2;
        n -= 2;
//
        int result = m - n;
        System.out.println(result);

        // Задание_5

        int p = 4;
        int s1 = ++p + p++; /*      после префикса ++p p=5; постфикс p++ остается равным 5, т.к.э сначала
        выполняется сложение 5+5, поэтому s1=10, а p=6     */
        System.out.println(s1);

        // Задание_6

        int q = 7;
        int output = --q - q--; //  после префикса q=6;  q-- постфикс, поэтому остается равным 6, затем 6-6=0, затем q=5
        System.out.println(output);

        // Задание_7

        int r = 9;
        r += 2;

        int z = r % 5; // увеличиваем r на 1, потом еще на 1; r=11,  11/5=2 и остаток 1, поэтому z=1
        System.out.println(z);

        // Задание_8

        int s = 15;
        s -= 3;
        int z1 = s % 4; // уменьшаем s на 3, s становится равным 12, затем 12/4=3, остаток 0, поэтому z1=0
        System.out.println(z1);

        // Задание_9

        int t = 6;
        int result1 = ++t - t-- + t++; /*  после префиксного инкремента t=7; затем постфиксный декремент t-- остается
        также равным 7(записывается значение 7), затем уменьшается на 1 и t++ становится равным 6,
        поэтому result1=7-7+6   =>   result1=6, а t становится равным 7.*/
        System.out.println(result1);

        // Задание_10

        int u = 12;
        int finalResult = u-- % ++u + --u; /* 1) u-- становится равным 12, т.к. это постфикс
        2) затем уменьшается на 1 u=11, но ++u снова добавляет единицу и u становится равным 12
        3) u-- % ++u = 12%12 => получается остаток 0
        4) так как u=12, --u = 11 (finalResult = 12 % 12 + 11) = 11 */
        System.out.println(finalResult);


    }
}
