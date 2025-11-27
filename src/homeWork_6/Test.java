package homeWork_6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       //int count=1;
       //for (int i=0; i<3; i++) {
       //    for (int k=0; k<3; k++) {
       //        System.out.print(count + " ");
       //        count++;
       //    }
       //}
       //for (int i = 0; i < 10; i++) {

       //    i++;
       //    System.out.println(i);
       //Scanner scanner=new Scanner(System.in);
       //System.out.println("Enter num start: ");
       //int start=scanner.nextInt();
       //System.out.println("Enter num end");
       //int end=scanner.nextInt();
       //for (int i = start; i <= end; i++) {
       //    System.out.println(i);

       //
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите число: ");
        int num= scanner.nextInt();


        for (int i = 0; i <=100 ; i++) {
            System.out.println(i);

            if (i==num)
                break;



        }



        }
    }

