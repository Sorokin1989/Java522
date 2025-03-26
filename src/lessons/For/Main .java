import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int j = 10;//j = 10
//        int b = ++j;//j = 11 , b = 11
//        int c = j++;//c = 11 , j = 12
//        b+=--c;//c = 10 , b = 21
//
//        System.out.println("j = " + j);//12
//        System.out.println("b = " + b);//21
//        System.out.println("c = " + c);//10


//        boolean ok = true;
//        int age = 29;
//
//
//        // !!true => !true => !false => true
//        if (!!ok || ++age>20){
//            System.out.println("Ok");
//        }
//
//        System.out.println(ok);
//        System.out.println(age);


//        int a =10;
//        int b =20;
//        int c =0;//30
//
//        if (30>1000){
//            System.out.println("Ok");
//            c = 1000;
//        }
//        System.out.println(c);


//        int a= 10;//10
//
//        a++;
//        a++;
//        a++;
////13
//        System.out.println(a+10);//23
////        a+=10;//a = a+10;
//        System.out.println(a);

//
//        System.out.println(a);//13
//        System.out.println(b);//10
//
//        int c = a+ b;
//        c+=b;
//
//        System.out.println(b);


//        a++ => a+=1; => a = a + 1;


//        Scanner scanner = new Scanner(System.in);
//
//
//        String symbl = scanner.next();
//
//
//        switch (symbl){
//            case "0","1","2","3","4":
//                System.out.println("Cislo");
//                break;
//        }


//        char symbl = scanner.next().charAt(0);
//        char symbl = scanner.next().charAt(0);


//        switch (symbl){
//            case '1','2','3','4','5','6','8','9','7','0':
//                System.out.println("Cislo");
//                break;
//            case 'A','B','V','F','Q','D','L','U','Z','P':
//                System.out.println("Cislo");
//                break;
//        }


//        boolean v = false;
//        System.out.println(!v);
//        v = !!v;
//        System.out.println(v);

        //^

        // odinakovie = 0
        // raznie = 1

//        int a = 5; // 0101
//        int b = 3; // 0011
//
//        int result = a^b;//0110  // 6
//        System.out.println(result);

//        int key = 777;
//        int value = 883456;
//
//        System.out.println(value);
//        int encrypted = value ^ key;
//        System.out.println(encrypted);
//        int decrypted = encrypted ^ key;
//        System.out.println(decrypted);


        //21:10

        //if , switch , for

        //loops
        //for , while , do while

//        int size = 5;
//        for (int i = 0;i <= size;i++){
//            System.out.print(i + " ");
//        }


//        int size = 5;
//        int i = 0;
//        boolean v = true;
//        for (;v;i++){
//            System.out.print(i + " ");
//        }


//        int i = 0;
//        for (; i <= 10; i += 5) {
//            System.out.print(i + " ");
////            i++;
////            i = i + 1;
////            ++i;
//            i -= 3;
//        }

//        int count = 1;
//
//        for (int i = 0; i < 3; i++) {
//            for (int k = 0; k < 3; k++) {
//                System.out.print(count + "  ");
//                count++;
//            }
//        }


//        int count = 1;

//        for (int i = 0; i < 3; i++) {
//            System.out.println("i = " + i);
//            System.out.println();
//            for (int k = 0; k < 3; k++) {
//                System.out.println("k = " + k);
////                System.out.print(count + "  ");
////                count++;
//            }
//            System.out.println("\n----------------");
//        }

//        for (int i = 0; i < 3; i++) {
//            System.out.print(count + "  ");
//            count++;
//        }
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print(count + "  ");
//            count++;
//        }

//        for (int k = 0; k < 3; k++) {
//            System.out.print(count + "  ");
//            count++;
//        }


//        int size = 5;
//        for (int i = 0;i <= size;i++){
//            System.out.print(i + " ");
//        }

        //for(1;2;4){
//            3
//        }


//        for(a;b;c){
//            d
//        }
        //a - inicializaciya peremen
        //b - uslovie
        //c - izminenie peremennix
        //d - telo fora


//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");
//        System.out.println("Farid");


//        for (int i = 0; i < 10; i+=2) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//            i++;
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i%2==0){
//                System.out.print(i + " ");
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i%2==0){
//                System.out.print(i + " ");
//            }
//        }


//        for (int i = -10; i < -20; i++) {
//            if (i%2==0){
//                System.out.print(i + " ");
//            }
//        }

//        for (int i = 10; i >= 0; i--) {
//            System.out.print(i + " ");
//        }


//        int size = 20;
//
//        for (int i = size; i >= -20; i--) {
//            System.out.print(i + " ");
//        }

//        int size = 20;
//
//        for (int i = size; i >= -20; i--) {
//            System.out.print(i + " ");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter num start : ");
//        int start = scanner.nextInt();
//        System.out.print("Enter num end   : ");
//        int end = scanner.nextInt();
////        if (start<end){
//            for (int i = start; i <= end; i++) {
//                System.out.print(i + " ");
//            }
////        }else{
////            System.out.println("Cisla ne korrektnie");
////        }
//


            //breake   stop raboti for
            //continue propusti iteraciyu i perexodi k sled
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int num = scanner.nextInt();

//        for (int i = 0; ; i++) {
//            System.out.print(i + " ");
//
//            if (i==10){
//                break;
//            }
//        }

//        for (int i = 0;i<10 ; i++) {
//            if (i==5){
//                continue;
//            }
//
//            System.out.print(i + " ");
//        }



//        for (int i = 0; i < 10; i+=2) {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n------------");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println("\n------------");
//
//        for (int i = 0; i < 10; i++) {
//            if (i%2==0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\n------------");
//
//        for (int i = 0; i < 10; i++) {
//            if (i%2!=0){
//                System.out.println("\n"+i + " not even");
//                continue;
//            }
//
//            System.out.print(i + " ");
//        }


        //1  Вывести числа от 10 до 1 в обратном порядке.
        //2  Вывести все нечётные числа от 1 до 50.
        //3  Посчитать сумму всех чётных чисел от 1 до N.
        //4  Найти количество чисел, кратных 5, в диапазоне от 1 до 100.
        //5  Вывести квадраты чисел от 1 до 10.
        //6  Вывести числа  от 1 до N.  Посчитать сколько там
        //   -четных
        //   -нечетных
        //   -деляться без остатка на 5 и на 6
        //   -деляться без остатка на 2 и на 3
        //   -деляться без остатка на 2 или на 10
        //   -деляться без остатка на 2 или на 4
        //   -деляться без остатка на 7 и на 3

        //7  Вывести числа от 1 до 100, которые делятся на 3 без остатка.
        //8  Вывести сумму чисел от 1 до 50.
        //9  Вывести все числа от 1 до N в одну строку через пробел.
        //10 Вывести произведение чисел от 1 до N.
        //11 Найти количество чисел от 1 до N, которые делятся на 2 или 5.
        //12 Вывести сумму чисел от 1 до N.
    }
}