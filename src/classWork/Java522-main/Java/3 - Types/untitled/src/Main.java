import javax.xml.crypto.dom.DOMCryptoContext;

public class Main {
    public static void main(String[] args) {








        //Основные типы данных

        //Целые числа (DEFAULT int)
//        byte              -           1 byte   (-128 + 127)
//        short             -           2 byte   (-32k + 32k)
//        int               -           4 byte   (-2 147xxx xxx + 2 147xxx xxx)
//        long              -           8 byte   (-xxxxxxxxxxxxxxxx +xxxxxxxxxxxxxxxxx) (L , l)

        //Дробные числа (DEFAULT Double)
//        float              -          4 byte   (-xxxxxxxxxxxxxxxx +xxxxxxxxxxxxxxxxx)  (f , F)
//        double             -          8 byte   (-xxxxxxxxxxxxxxxx +xxxxxxxxxxxxxxxxx)

        //Символы  ''
        // char              -          2 byte
//        char a = 'a';

        //Логические значение
        // boolean          -           1 byte  true,false


        //Java все типы данные деляться на

        //1 Примитивные типы (primitive types) (char,int,byte,short,long,double,float,boolean,char) (Stack)
        //2 Ссылочные типы (references types) (class , interfaces , enum , record) (Heap)

//        String s = "Farid kak ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssdela 999 !@#$%^";

//        String s = "12345";
//        String s2 = "678910";
//        System.out.println(s + s2);


//        boolean a = true;
//        a = false;

        //SQL
        //0
        //1


//        int a = 10;
//        int b = 2;
//        int c = a + b;
//
//        System.out.println(c);


//        int a = 10;
//        int b = 2;
//        a = a + b;
//
//        System.out.println(a);

//        int a = 10;
//        int b = 20;
//        int c = 2;
//
//        int d = (a+b)/c;
//        System.out.println(d);//15

//        int x = 15;
//        int y = 6;
//        int d = x%y;    //10/3=3 (1)    15/6 = 2 (3)
//
//        System.out.println(d);

//        int x = 40;
//        int y = 20;
//        System.out.println(x%y);   //40/20=2  (0)


        //10,20,5

//        System.out.println(101%2);


//        int x = 10;
//        int y = 20;

//        int x = 180;
//
//        System.out.println("Cislo cetnoe : " + (x%2==0));



           //Оператор + - * /
           //Операнд   10 20

//        System.out.println(5+5);
        //Оператор +
        //Операнд  5 и 5



        //Унарные и бинарные операции


//        int z = +5;//+5


        //Префиксный
        //Постфиксный



        //инкремент  +1
        //декремент  -1

//        int x = 10;
//        x = x + 1;
//        x+=1;//x = x + 1
//        x++;//x = x + 1
//        x++;//x = x + 1
//        x++;//x = x + 1
//        x--;// x = x - 1 , x-=1;



        //Префиксный инкремент  ++x
        //Постфиксный инкремент  x++

        //Префиксный декремент  --x
        //Постфиксный декремент  x--

//        System.out.println(x);

//        int x = 10;
//        int z = x++;//10
//
//        System.out.println(x);//11
//        System.out.println(z);//10

//        int x =2;
//
//        int z = 1 - 3;//-2


//        int x = 1;
//        int y = 2;
//        int z = x + ++y;
//        System.out.println(z);//4
//        System.out.println(y);//3



//        int z = 1;
//        int y = ++z - ++z;
//        System.out.println(y);//-1
//
//
//        y = 1;
//        y = z++ - z++;
//        System.out.println(y);//-1



//        int x = 1;
//        int y = ++x;//x = 2 , y = 2
////        int y = x++;//y = 1 , x = 2
//        int z = ++y;//y= 2 , z = 2
//        System.out.println("x = " + x);//2
//        System.out.println("y = " + y);//2
//        System.out.println("z = " + z);//2




//        int y = 1;

//        int x = 10;
//        int y = --x;// x = 9 , y = 9
//        int z = ++y;// y = 10 , z = 10
//        x = --x - --x; //1
//        System.out.println("x = " + x);//1
//        System.out.println("y = " + y);//10
//        System.out.println("z = " + z);//10


//        int x = 10;
//        int y = --x;//y = 9 , x = 9
//        int z = ++y;//z = 10 , y = 10
//        x = --x - --x; // 1
//        System.out.println("x = " + x);//1
//        System.out.println("y = " + y);//10
//        System.out.println("z = " + z);//10



//        int x = 10;
//        int y = x--;//y = 10 , x = 9
//        int f = --x + --x;//f = 15
//        y-=x++; // y = y - x++ //y = 3
//
//        System.out.println("x : " + x);//8
//        System.out.println("y : " + y);//3
//        System.out.println("f : " + f);//15



//        int x = 10;
//        int y = x--; // y = 10 ,  x = 9
//        int f = --x + --x; //x = 7   f = 15
//        y-=x++; // y = y - x++ // y = 3 , x = 8
//
//        System.out.println("x : " + x);//8
//        System.out.println("y : " + y);//3
//        System.out.println("f : " + f);//15



//        int x = 10;
//        System.out.println(x++);//x =11
//        System.out.println(x);
//
//        int x = 10;//9
//        System.out.println(--x);//9
//        System.out.println(x);



//        int x = 10;
//
////        x = x + 20;
////        x+=20;
//
////        x = x * 2;
////        x*=2;
//
//        x+=++x;
//        System.out.println(x);


//        int x = 10;
////        x+=++x;
//        x = x + ++x;
//        System.out.println(x);


        //
//        int x=1;
//
//        x++;
//        System.out.println(x);


        //  == !=  > , < >= <=
//        int x = 10;
//        int y = 10;

//        System.out.println(x>y);

        // += -+ *= /+


        //Явные и Неявные преобразования

        //Неявные (автоматические) преобразования   little -> big
        int num = 100;
        double d = num; // int -> double
//        System.out.println(d);
        //byte ->  short -> int -> long
//        int -> double
//        short -> float
//        char -> int

        //Явные (кастинга) преобразования
        int v = 1000;
        byte z = (byte) v;//-128 + 127
        System.out.println(z);








    }
}










