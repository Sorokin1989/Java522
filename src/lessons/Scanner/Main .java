import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Farid");

//        System.out.println("Farid , mne " + 29);

//        int age = 29;
//        System.out.println("Farid , mne " + age);

//        int age = 41;
//        String name = "Oleq";
//
//
//        System.out.println(name + " , mne " + age);

//        System.out.printf(" %s , mne %d " , "Farid",29);

//        %s    -> String
//        %d    -> (int , long , short , byte)
//        %f    -> (float , double)
//        %c    -> (char)
//        %b    -> (boolean)
//        %n    -> (\n)
//        %%    -> (%)

//        int age = 41;
//        String name = "Oleq";
//
//        //Farid , mne  29
//        System.out.printf(" %s %s %s %s %s %s %s %s , mne %d %n" ,name,name,name,name,name,name,name,name,age);
//        System.out.printf(" %s %s %s %s %s %s %s %s , mne %d %n" ,name,name,name,name,name,name,name,name,age);


        ////////////////////////////////////

        //Escape sequences
        // " ,  /
//        System.out.println("Farid ' ' \\  \"Fanta\"");


        // \n     perexod na novuyu liniyu
        // \t     tabulyacuta
        // \b     remove pred simvol


//        System.out.print(" 2\"   1\n2\b3\n4\n5");
//        System.out.print("\u2764");

//        System.out.println("Farid");


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age : ");
//        scanner.nextInt();

//        Scanner scanner = new Scanner(System.in);
//        scanner.next()    // slovo
//        scanner.nextLine()    // stroka
//        scanner.nextInt() // cislo int
//        scanner.nextLong() // cislo long
//        scanner


//        System.out.print("Enter your age : ");
//        int age = scanner.nextInt();
//        System.out.println("age * age = " + (age*age));


//        System.out.print("Enter text : ");
//        String str = scanner.nextLine();//F  fARID FARID KAK DELA
//        System.out.println(str);

//        System.out.print("Enter text : ");
//        String str = scanner.next();
//        System.out.println(str);

//        System.out.println("10");
//        System.out.println(10);

//        System.out.print("Enter text : ");
//        String str = scanner.nextLine();
//        System.out.println(str);


//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//
//        System.out.print("Enter your age  : ");
//        int age = scanner.nextInt();
//        System.out.print("Enter your name : ");
//        String name = scanner2.nextLine();
//
//
//        if (age>=18){
//            System.out.println("Welcome dear " + name);
//        }else{
//            System.out.println("Sorry bye bye"+ name);
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age  : ");
//        int age = scanner.nextInt();
//        System.out.print("Enter your name : ");
//
//        scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//
//        if (age>=18){
//            System.out.println("Welcome dear " + name);
//        }else{
//            System.out.println("Sorry bye bye"+ name);
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age  : ");
//        int age = scanner.nextInt(); // 29\n
//
////        scanner = new Scanner(System.in); //
//        scanner.nextLine();//clear buffer
//
//        System.out.print("Enter your name : ");
//        String name = scanner.nextLine();
//
//
//        if (age>=18){
//            System.out.println("Welcome dear " + name);
//        }else{
//            System.out.println("Sorry bye bye"+ name);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextLine().charAt(0));


//        Scanner scanner = new Scanner(System.in);
//        char symb = scanner.next().charAt(0);
//        System.out.println(symb);


        //IF , SWITCH

//        int dayOfWeek = 1;
//
//        switch (dayOfWeek){
//            case 1:
//                System.out.println("Понедельник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 3:
//                System.out.println("Среда");
//                break;
//            case 4:
//                System.out.println("Четверг");
//                break;
//            case 5:
//                System.out.println("Пятница");
//                break;
//            case 6:
//                System.out.println("Суббота");
//                break;
//            case 7:
//                System.out.println("Воскресенье");
//                break;
//        }


//        int age = 2;
//
//        if (age>=5 && age <= 50){
//
//        }
//
//        switch (age) {
//            case 1:
//                System.out.println("Да 1");
//            case 2:
//                System.out.println("Да 2");
//                break;
//            case 3:
//                System.out.println("Да 3");
//                break;
//        }


//        String name = "Farid"; //"1"
//
//        switch (name) {
//            case "Farid":
//                System.out.println("Да 1");
//            case "Dima":
//                System.out.println("Да 2");
//                break;
//            case "Oleq":
//                System.out.println("Да 3");
//                break;
//        }

//        long x = 1; //"1"

//        switch (x)   // long , double , float , boolean  // ERROR
//        switch (x)   // BYTE,INT , SHORT , CHAR , STRING , ENUM   // +


//        int age = 55;
//
//        switch (age){
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Not data");
//                break;
//
//        }


//        int age = 111;
//
//        switch (age){
//            case 1:
//                System.out.println("One");
//                break;
//            case 11:
//                System.out.println("One");
//                break;
//            case 111:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 22:
//                System.out.println("Two");
//                break;
//            case 222:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 33:
//                System.out.println("Three");
//                break;
//            case 333:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Not data");
//                break;
//
//        }


//        int age = 1;
//
//        switch (age){
//            case 1:
//            case 11:
//            case 111:
//                System.out.println("One");
//                break;
//            case 2:
//            case 22:
//            case 222:
//                System.out.println("Two");
//                break;
//            case 3:
//            case 33:
//            case 333:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Not data");
//                break;
//
//        }


//        double d1 = 0.1;
//        double d2 = 0.2;
//        double d3 = d1+d2;
//
//        System.out.println(d3);


        //double a = 3.456;
        //String str = "3.456"


//        int age = 1;
//        switch (age){
//            case 1, 11,111:
//                System.out.println("One");
//                break;
//            case 2, 22,222:
//                System.out.println("Two");
//                break;
//            case 3,33,333:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Not data");
//                break;
//        }

//        char age = 'a';
//        switch (age){
//            case 'a':
//                System.out.println("One");
//                break;
//            case 'g':
//                System.out.println("Two");
//                break;
//            case 'd':
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Not data");
//                break;
//        }

//1.81
//        double d = 0.3;
//        double z = 0.3;
//        double f = 0.3;
//        double result = d+z+f;
//        System.out.println(result);
//
//        BigDecimal bigDecimal

//        double d = 0.5;
//        double z = 0.5;
//        double f = 0.5;
//        double result = d+z+f;
//        System.out.println(result);

        //1 bit  znak


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Какой сегодня день : ");
//        byte dayOfWeek = scanner.nextByte();
//
//        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
//            switch (dayOfWeek) {
//                case 1:
//                    System.out.println("Понедельник");
//                    break;
//                case 2:
//                    System.out.println("Вторник");
//                    break;
//                case 3:
//                    System.out.println("Среда");
//                    break;
//                case 4:
//                    System.out.println("Четверг");
//                    break;
//                case 5:
//                    System.out.println("Пятница");
//                    break;
//                case 6:
//                    System.out.println("Суббота");
//                    break;
//                case 7:
//                    System.out.println("Воскресенье");
//                    break;
//                default:
//                    System.out.println("wrong data");
//            }
//        } else {
//            System.out.println("Diapazon ne verniy doljno bit ot 1 do 7");
//        }

//
//     1) Напишите программу, которая проверяет день недели по его номеру (1 — Понедельник, 2 — Вторник и т.д.) и выводит название дня недели.
//     2) Напишите программу, которая проверяет, какой месяц по номеру введен пользователем (1 — Январь, 2 — Февраль и т.д.) и выводит его название.
//     3) Напишите программу, которая проверяет номер счета (от 1 до 5) и выводит текст "Выбран первый счет", "Выбран второй счет" и так далее, в зависимости от номера.
//     4) Напишите программу, которая принимает на вход оценку (целое число от 1 до 5) и выводит соответствующую строку: "Неудовлетворительно", "Удовлетворительно", "Хорошо", "Отлично".
//     5) Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том, является ли она гласной (A, E, I, O, U, Y) или согласной.
//     6) Напишите программу, которая по введенному символу определяет его тип: цифра, буква или специальный символ.
//     7) Напишите программу, которая выводит название операционной системы в зависимости от введенного кода: 1 — Windows, 2 — Linux, 3 — macOS.
//     8) Напишите программу, которая по введенному возрасту (в годах) выводит категорию человека: "Ребенок", "Подросток", "Взрослый", "Пожилой".
//     9) Напишите программу, которая по введенному числу месяца (от 1 до 12) выводит сезон года: "Зима", "Весна", "Лето", "Осень".
//     10) Напишите программу, которая по введенному коду валюты (USD, EUR, GBP) выводит название валюты на русском языке: "Доллар США", "Евро", "Британский фунт".


    }


}