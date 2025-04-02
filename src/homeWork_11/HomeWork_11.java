package homeWork_11;

import java.util.Random;

public class HomeWork_11 {
    public static void main(String[] args) {
        // - 1. Создать статический массив из 10 чисел и вывести его на экран.
        //   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //   for (int i = 0; i < 10; i++) {
        //     System.out.print(arr[i] + " ");

        //  }

        //2. Ввести с клавиатуры 5 чисел в статический массив и посчитать их сумму.

        //    Scanner scanner=new Scanner(System.in);
        //    int size=5;
        //    int[] arr=new int[size];

        //    for (int i = 0; i < size; i++) {
        //        arr[i]=scanner.nextInt();

        //    }

        //    for (int i = 0; i < size; i++) {
        //        System.out.print(arr[i] + " ");
        //    }
        //    int sum=0;
        //    for (int i = 0; i < size; i++) {
        //        sum=sum+arr[i];
        //    }
        //        System.out.print("Sum=" + sum);
        // 3. Создать статический массив из 8 элементов и вывести его в обратном порядке.


        //  int[] arr={0,3,4,2,5,6,7,8};
        //  for (int i = arr.length-1; i >=0;i--) {
        //      System.out.print(arr[i] + " ");

        //  }

        // 4. Заполнить статический массив из 12 элементов числами от 1 до 12 и найти среднее арифметическое.

        //   Random random=new Random();
        //   int min=1;
        //   int max=12;

        //   int[] arr=new int[12];
        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i] = random.nextInt(max-min+1)+min;
        //       System.out.print(arr[i] + " ");
        //   }
        //   int sum=0;
        //   double arithmetic =0;
        //   for (int i = 0; i < arr.length; i++) {
        //       sum=sum+arr[i];
        //       arithmetic=(double) sum/arr.length;
        //
        //   }

        //   System.out.println("\nArithmetic: " + " " + arithmetic);


        //5. Заполнить статический массив из 10 элементов случайными числами и вывести только четные числа.

        //  Random random = new Random();
        //  int[] arr = new int[10];
        //  for (int i = 0; i < arr.length; i++) {
        //      arr[i] = random.nextInt(100);
        //      System.out.print( arr[i] + " "); // массив
        //  }
        //  System.out.println();
//
        //  for (int j = 0; j < arr.length; j++) {
        //      if (arr[j] % 2 == 0) {
        //          System.out.print( arr[j] + " "); // четные числа в массиве
        //      }
//
        //  }


        //6. Заполнить статический массив из 15 элементов случайными числами от 1 до 100 и найти максимальное значение.
        //   Random random =new Random();
        //   int min=1;
        //   int max=100;
        //   int[] arr=new int[15];
        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i]=random.nextInt(max-min+1)+min;
        //      System.out.print(arr[i] + " ");
        //   }
//
        //   int maxx=arr[0];
        //   for (int i = 0; i < arr.length; i++) {
        //       if (arr[i]>maxx) {
        //           maxx=arr[i];
        //       }
//
        //   } System.out.println("\nМаксимальное число в массиве: " + maxx);

        // 7. Заполнить статический массив из 15 элементов четными числами от 2 до 30.

        //   Random random=new Random();
        //   int min=2;
        //   int max=30;


        //   int[] arr=new int[15];
        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i]= random.nextInt(max-min+1)+min;
        //       if (arr[i] % 2 == 0) {

        //           System.out.print(arr[i] + " ");
        //       }
        //   }

        //8. Ввести статический массив из 6 чисел и посчитать количество положительных элементов.
        // показывали на уроке!

        //    //9. Заполнить статический массив из 10 элементов случайными числами от -10 до 10 и вывести только отрицательные элементы.

        //    Random random=new Random();
        //    int min=-10;
        //    int max=10;

        //    int[] arr=new int[10];
        //    System.out.print("Массив: ");
        //    for (int i = 0; i <arr.length ; i++) {
        //        arr[i]= random.nextInt(max-min+1)+min;
        //        System.out.print(arr[i] + " ");
        //    }
        //    System.out.println();
        //    System.out.print("Отрицательные числа: ");
        //    for (int i = 0; i < arr.length; i++) {
        //        if (arr[i]<0)

        //            System.out.print( arr[i] + " ");

        //    }

        //10. Создать статический массив из 10 элементов и заменить все нечетные числа на 0.
//
        //    Random random=new Random();
        //    int min=1;
        //    int max=100;
//
        //    int [] arr=new int[10];
        //    for (int i = 0; i <arr.length ; i++) {
        //        arr[i]= random.nextInt(max-min+1)+min;
        //        System.out.print(arr[i]+ " ");
//
        //    }
        //    System.out.println();
        //    System.out.println();
        //    for (int i = 0; i < arr.length; i++) {
        //        if (arr[i]%2!=0) {
        //            arr[i]=0;
        //        }
        //        System.out.print(arr[i] + " ");
//
//
        //    }

        //11. Заполнить массив из 7 элементов случайными числами от 0 до 50 и вывести их сумму.

        //   Random random=new Random();
        //   int min=0;
        //   int max=50;
        //   int sum=0;

        //   int [] arr=new  int[7];
        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i]= random.nextInt(max-min+1)+min;
        //       System.out.print(arr[i] + " ");
        //   }
        //   System.out.println();
        //   for (int i = 0; i < arr.length; i++) {
        //       sum+=arr[i];

        //   }
        //   System.out.print("Сумма: " + sum);

        // 12. Создать массив из 10 элементов и посчитать количество четных и нечетных элементов.

        //     Random random = new Random();
        //     int min = 1;
        //     int max = 50;
        //     int count = 0;
        //     int count2 = 0;
//
        //     int[] arr = new int[10];
        //     for (int i = 0; i < arr.length; i++) {
        //         arr[i] = random.nextInt(max - min + 1) + min;
        //         System.out.print(arr[i] + " ");
        //     }
        //     for (int i = 0; i < arr.length; i++) {
        //         if (arr[i] % 2 == 0) {
        //             count++;
        //         }
        //     }
        //     System.out.println("\nКоличество четных чисел: " + " " + count);
//
        //     for (int i = 0; i < arr.length; i++) {
        //         if (arr[i] % 2 != 0) {
        //             count2++;
        //         }
        //     }
        //     System.out.println("\nКоличество нечетных чисел: " + " " + count2);

        // 13. Заполнить массив из 15 элементов числами, которые вводит пользователь, и найти минимальное значение.

        //      Scanner scanner = new Scanner(System.in);
        //
        //      int[] arr = new int[15];
        //
        //
        //      for (int i = 0; i < arr.length; i++) {
        //          arr[i] = scanner.nextInt();
        //      }
        //
        //      for (int i = 0; i < arr.length; i++) {
        //          System.out.print(arr[i] + " ");
        //      }
        //
        //      int min = arr[0];
        //      for (int i = 0; i < arr.length; i++) {
        //
        //          if (arr[i] < min) {
        //              min = arr[i];
        //          }
        //      }
        //      System.out.print("\nМинимальное значение: " + " " + min);

        //14. Создать массив из 8 элементов и заменить все отрицательные числа на их модули.

        //    Random random = new Random();
        //    int min = -10;
        //    int max = 10;
//
        //    int[] arr = new int[8];
        //    System.out.print("                        Исходный массив: ");
        //    for (int i = 0; i < arr.length; i++) {
        //        arr[i] = random.nextInt(max - min + 1) + min;
        //        System.out.print(arr[i] + " ");
        //    }
        //    System.out.print("\nМассив после замены отрицательных чисел: ");
        //    for (int i = 0; i < arr.length; i++) {
        //        if (arr[i] < 0) {
        //            arr[i] = -arr[i];
        //        }
        //        System.out.print(arr[i] + " ");
        //    }

        //15. Заполнить массив из 12 элементов случайными числами от -20 до 20 и вывести произведение всех положительных элементов.
        //
        //    Random random = new Random();
        //    int min = -20;
        //    int max = 20;
        //    int multiplication = 1;
//
        //    int[] arr = new int[12];
        //    for (int i = 0; i < arr.length; i++) {
        //        arr[i] = random.nextInt(max - min + 1) + min;
        //        System.out.print(arr[i] + " ");
        //    }
        //    for (int i = 0; i < arr.length; i++) {
        //        if (arr[i] > 0) {
        //            multiplication *= arr[i];
        //        }
//
        //    }
        //    System.out.print("\nПроизведение положительных чисел: " + " " + multiplication);

        // 16. Создать массив из 9 элементов заполнить случайными числами от -5 до 5 и вывести индексы всех нулевых элементов.

        //   Random random = new Random();

        //   int min = -5;
        //   int max = 5;
        //   int[] arr = new int[9];

        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i] = random.nextInt(max - min + 1) + min;
        //       System.out.print(arr[i] + " ");
        //   }
        //   System.out.print("\nИндекс нулевого элемента: ");
        //   for (int i = 0; i < arr.length; i++) {
        //       if (arr[i] == 0)
        //           System.out.print(i + ", ");
        //   }

        //17. Заполнить массив из 10 элементов последовательностью 1, 2, 3, 4, ..., 10 и вывести сумму элементов с четными индексами.

        //    Scanner scanner = new Scanner(System.in);
//
        //    int[] arr = new int[10];
//
        //    for (int i = 0; i < arr.length; i++) {
        //        arr[i] = scanner.nextInt();
        //    }
        //    for (int i = 0; i < arr.length; i++) {
        //        System.out.print(arr[i] + " ");
        //    }
        //    int sum = 0;
        //    for (int i = 0; i < arr.length; i++) {
        //        if (i % 2 == 0) {
        //            sum += arr[i];
        //        }
//
        //    }
        //    System.out.println("\nСумма элементов с четными индексами: " + " " + sum);

        //18. Создать массив из 6 элементов и проверить, есть ли в нем хотя бы один отрицательный элемент.

        //    Random random = new Random();
        //    int min = -5;
        //    int max = 5;
        //    int count = 0;

        //    int[] arr = new int[6];
        //    for (int i = 0; i < arr.length; i++) {
        //        arr[i] = random.nextInt(max - min + 1) + min;
        //        System.out.print(arr[i] + " ");
        //    }
        //    for (int i = 0; i < arr.length; i++) {
        //        if (arr[i] < 0) {
        //            count++;
        //        }

        //    }
        //    System.out.println("\nКоличество отрицательных элементов: " + " " + count);

        //19. Заполнить массив из 11 элементов числами от 11 до 1 в обратном порядке.

        //    Scanner scanner = new Scanner(System.in);
        //    int[] arr = new int[11];
//
        //    for (int i = 0; i < arr.length; i++) {
        //        arr[i] = scanner.nextInt();
        //    }
        //    for (int i = arr.length - 1; i >= 0; i--) {
        //        System.out.print(arr[i] + " ");
        //    }
//
        //20. Создать массив из 5 элементов, заполнить его случайными числами и определить, сколько элементов больше среднего арифметического
        // решали на уроке!

        //21. Заполнить массив из 10 элементов кубами индексов (0, 1, 8, 27, ...).

        // int[] arr = new int[10];

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = i * i * i;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // 22. Создать массив из 7 элементов и посчитать, сколько раз в нем меняется знак числа при переходе от элемента к элементу.
        // делали на уроке

        //23. Заполнить массив из 12 элементов случайными числами от 1 до 100 и вывести числа, кратные 5.

        //   Random random = new Random();
        //   int min = 1;
        //   int max = 100;

        //   int[] arr = new int[12];
        //   System.out.print("Массив: ");
        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i] = random.nextInt(max - min + 1) + min;
        //       System.out.print(arr[i] + " ");
        //   }
        //   System.out.print("\nЧисла, кратные 5: ");
        //   for (int i = 0; i < arr.length; i++) {
        //       if (arr[i] % 5 == 0)
        //           System.out.print(arr[i] + " ");

        //   }

        // 24. Создать массив из 9 элементов и поменять местами первый и последний элементы.
        //   Random random = new Random();
        //   int min = 1;
        //   int max = 20;

        //   int[] arr = new int[9];
        //   System.out.print("Исходный массив: ");
        //   for (int i = 0; i < arr.length; i++) {
        //       arr[i] = random.nextInt(max - min + 1) + min;
        //       System.out.print(arr[i] + " ");
        //   }
        //   System.out.print("\nМассив после замены элементов: ");
        //
        //   for (int i = 0; i < arr.length; i++) {
        //       if (arr.length > 1) {
        //           int number = arr[0];
        //           arr[0] = arr[arr.length - 1];
        //           arr[arr.length - 1] = number;
        //       }
        //       System.out.print(arr[i] + " ");
        //   }

        //25. Заполнить массив из 8 элементов случайными числами и найти разницу между максимальным и минимальным элементами.

        Random random = new Random();
        int min = 0;
        int max = 20;

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
            System.out.print(arr[i] + " ");
        }

        int maxx = arr[0];
        int minn = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxx) {
                maxx = arr[i];
            }
        }
        System.out.println();

        System.out.println("Максимальное значение: " + maxx);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minn) {
                minn = arr[i];
            }
        }
        System.out.print("Минимальное значение: " + minn);

        System.out.println("\nРазница между max и min" + " " + (maxx - minn));


    }
}
