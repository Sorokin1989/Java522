package homeWork_12;

import java.util.Random;

public class HomeWork_12 {
    public static void main(String[] args) {
        //1 Создать двумерный массив 2x5 и вывести его на экран.

        //     int[][] arrays = {
        //             {1, 2, 3, 4, 5},
        //             {6, 7, 8, 9, 10},
        //     };
        //     for (int i = 0; i < arrays.length; i++) {
        //         for (int j = 0; j < arrays[i].length; j++) {
        //             System.out.print(arrays[i][j] + " ");
        //         }
        //         System.out.println();
        //     }


        //2 Ввести с клавиатуры 2 строки по 3 числа и посчитать сумму всех элементов массива.


        //Scanner scanner = new Scanner(System.in);

        //    int[][] arrays = new int[2][3];


        //    for (int i = 0; i < arrays.length; i++) {
        //        for (int j = 0; j < arrays[i].length; j++) {
        //            arrays[i][j] = scanner.nextInt();
        //        }
        //    }
        //    for (int i = 0; i < arrays.length; i++) {
        //        System.out.println();
        //        for (int j = 0; j < arrays[i].length; j++) {
        //            System.out.print(arrays[i][j] + " ");
        //        }
        //    }


        //    int sum = 0;
        //    for (int i = 0; i < arrays.length; i++) {
        //        for (int j = 0; j < arrays[i].length; j++) {
        //            sum = sum + arrays[i][j];
        //        }
        //    }
        //  System.out.print("\nСумма элементов: " + sum);


        //3 Создать двумерный массив 2x4 и вывести все элементы в обратном порядке (от последнего к первому).

        int[][] arrays = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println();
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }

            ;   }
            ;   System.out.println();
            ;   System.out.print("\nВ обратном порядке: ");
            ;   for (int i = arrays.length - 1; i >= 0; i--) {
            ;       System.out.println();
            ;       for (int j = arrays[i].length - 1; j >= 0; j--) {
            ;           System.out.print(arrays[i][j] + " ");
            ;       }
            ;   }


            // 4 Заполнить двумерный массив 3x4 числами от 1 до 12 и найти их среднее арифметическое.

            //      int[][] arrays = {{1, 2, 3, 4},
            //                       {5, 6, 7, 8},
            //                       {9, 10, 11, 12}};

            //      for (int i = 0; i < arrays.length; i++) {
            //          System.out.println();
            //          for (int j = 0; j < arrays[i].length; j++) {
            //              System.out.print(arrays[i][j] + " ");
            //          }
            //      }
            //      double arithmetic = 0;
            //      int sum = 0;
            //      for (int i = 0; i < arrays.length; i++) {
            //          for (int j = 0; j < arrays[i].length; j++) {
            //              sum = (sum + arrays[i][j]);
            //              arithmetic = (double) sum / (arrays.length * arrays[i].length);
            //          }
            //      }
            //      System.out.print("\nСреднее арифметическое: " + arithmetic);

            // 5 Заполнить двумерный массив 2x5 случайными числами от 0 до 100 и вывести только чётные числа.

            //    Random random = new Random();
            //
            //    int min = 0;
            //    int max = 100;
            //
            //    int[][] arrays = new int[2][5];
            //    System.out.print("Исходный массив: ");
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = random.nextInt(max - min + 1) + min;
            //            System.out.print(arrays[i][j] + " ");
            //        }
            //
            //    }
            //    System.out.println();
            //    System.out.print("\nТолько четные числа: ");
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //
            //            if (arrays[i][j] % 2 == 0) {
            //                System.out.print(arrays[i][j] + " ");
            //            }
            //
            //        }
            //    }
            //

            //6 Заполнить двумерный массив 3x5 случайными числами от 1 до 100 и найти максимальное значение.
            //    Random random = new Random();
            //    int min = 1;
            //    int max = 100;
            //    int[][] arrays = new int[3][5];
            //    int maxNumber = arrays[0][0];

            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = random.nextInt(max - min + 1) + min;
            //            System.out.print(arrays[i][j] + " ");
            //        }

            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            if (arrays[i][j] > maxNumber) {
            //                maxNumber = arrays[i][j];
            //            }

            //        }

            //    }
            //    System.out.print("\nМаксимальное значение: " + maxNumber);

            //7 Заполнить двумерный массив 3x5 чётными числами от 2 до 30 по порядку.

            // int[][] arrays = new int[3][5];

            // for (int i = 0; i < arrays.length; i++) {
            //     System.out.println();
            //     for (int j = 0; j < arrays[i].length; j++) {
            //         arrays[i][j] = 2 * i + (4 * i + j) * 2 + 2;
            //         System.out.print(arrays[i][j] + " ");
            //     }

            // }

            // 8 Ввести двумерный массив 2x3 с клавиатуры и посчитать количество положительных элементов.

            //     Scanner scanner = new Scanner(System.in);

            //     int[][] arrays = new int[2][3];
            //     int count = 0;

            //     for (int i = 0; i < arrays.length; i++) {
            //         for (int j = 0; j < arrays[i].length; j++) {
            //             arrays[i][j] = scanner.nextInt();
            //         }
            //     }

            //     for (int i = 0; i < arrays.length; i++) {
            //         System.out.println();
            //         for (int j = 0; j < arrays[i].length; j++) {
            //             System.out.print(arrays[i][j] + " ");
            //         }
            //     }
            //     for (int i = 0; i < arrays.length; i++) {
            //         System.out.println();
            //         for (int j = 0; j < arrays[i].length; j++) {
            //             if (arrays[i][j] > 0) {
            //                 count++;
            //             }

            //         }
            //     }
            //     System.out.print("Количество положительных элементов: " + count);

            // 9 Заполнить двумерный массив 2x5 случайными числами от -10 до 10 и вывести только отрицательные числа.

            //    Random random = new Random();
            //    int min = -10;
            //    int max = 10;
            //    int[][] arrays = new int[2][5];
            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = random.nextInt(max - min + 1) + min;

            //        }
            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            System.out.print(arrays[i][j] + " ");
            //        }
            //    }
            //    System.out.println();
            //    System.out.print("\nОтрицательные числа: ");
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            if (arrays[i][j] < 0)
            //                System.out.print(arrays[i][j] + " ");
            //        }
            //    }

            //10 Создать двумерный массив 2x5 и заменить все нечётные числа на 0.

            //    Random random = new Random();

            //    int min = 1;
            //    int max = 50;

            //    int[][] arrays = new int[2][5];

            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = random.nextInt(max - min + 1) + min;
            //            ;
            //        }
            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            System.out.print(arrays[i][j] + " ");
            //        }
            //    }
            //    System.out.println();
            //    System.out.print("\nЗамена нечетных чисел на 0: ");
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            if (arrays[i][j] % 2 != 0) {
            //                arrays[i][j] = 0;
            //            }
            //            System.out.print(arrays[i][j] + " ");

            //        }
            //    }


            //11 Заполнить двумерный массив 2x7 случайными числами от 0 до 50 и вывести их сумму.

            //   Random random = new Random();
            //   int min = 0;
            //   int max = 50;
            //   int sum = 0;

            //   int[][] arrays = new int[2][7];

            //   for (int i = 0; i < arrays.length; i++) {
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           arrays[i][j] = random.nextInt(max - min + 1) + min;
            //       }
            //   }
            //   for (int i = 0; i < arrays.length; i++) {
            //       System.out.println();
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           System.out.print(arrays[i][j] + " ");
            //       }
            //   }
            //   for (int i = 0; i < arrays.length; i++) {
            //       System.out.println();
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           sum = sum + arrays[i][j];
            //       }
            //   }
            //   System.out.print("Сумма элементов: " + sum);


            //12 Создать двумерный массив 2x5 и посчитать количество чётных и нечётных элементов.

            //     Random random = new Random();
            //     int min = 0;
            //     int max = 50;
            //     int count = 0;
            //     int count2 = 0;

            //     int[][] arrays = new int[2][5];

            //     for (int i = 0; i < arrays.length; i++) {
            //         for (int j = 0; j < arrays[i].length; j++) {
            //             arrays[i][j] = random.nextInt(max - min + 1) + min;
            //         }

            //     }
            //     for (int i = 0; i < arrays.length; i++) {
            //         System.out.println();
            //         for (int j = 0; j < arrays[i].length; j++) {
            //             System.out.print(arrays[i][j] + " ");
            //         }

            //     }
            //     for (int i = 0; i < arrays.length; i++) {
            //         System.out.println();
            //         for (int j = 0; j < arrays[i].length; j++) {
            //             if (arrays[i][j] % 2 == 0)
            //                 count++;
            //             else count2++;
            //         }

            //     }
            //     System.out.print("Количество четных элементов: " + count);
            //     System.out.print("\nКоличество нечетных элементов: " + count2);

            //13 Ввести с клавиатуры двумерный массив 3x5 и найти минимальное значение.

            //    Scanner scanner = new Scanner(System.in);

            //    int[][] arrays = new int[3][5];


            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = scanner.nextInt();
            //        }

            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            System.out.print(arrays[i][j] + " ");
            //        }

            //    }
            //    System.out.println();
            //    System.out.print("\nМинимальное значение в массиве: ");
            //    int min = arrays[0][0];
            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            if (arrays[i][j] < min) {
            //                min = arrays[i][j];
            //            }
            //        }

            //    }
            //    System.out.print(min);


            //14 Создать двумерный массив 2x4 и заменить все отрицательные числа на их модули.

            //   Random random = new Random();
            //   int min = -20;
            //   int max = 20;

            //   int[][] arrays = new int[2][4];

            //   for (int i = 0; i < arrays.length; i++) {
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           arrays[i][j] = random.nextInt(max - min + 1) + min;
            //       }
            //   }
            //   System.out.print("Исходный массив: ");
            //   for (int i = 0; i < arrays.length; i++) {
            //       System.out.println();
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           System.out.print(arrays[i][j] + " ");
            //       }
            //   }
            //   System.out.print("\nМассив после замены знака: ");
            //   for (int i = 0; i < arrays.length; i++) {
            //       System.out.println();
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           if (arrays[i][j] < 0)
            //               arrays[i][j] = -arrays[i][j];
            //           System.out.print(arrays[i][j] + " ");
            //       }
            //   }


            //15 Заполнить двумерный массив 3x4 случайными числами от -20 до 20 и найти произведение всех положительных элементов.

            //    Random random = new Random();

            //    int min = -20;
            //    int max = 20;
            //    int multiplication = 1;

            //    int[][] arrays = new int[3][4];

            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = random.nextInt(max - min + 1) + min;
            //        }
            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            System.out.print(arrays[i][j] + " ");
            //        }
            //    }

            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            if (arrays[i][j] > 0)
            //                multiplication *= arrays[i][j];
            //        }
            //    }
            //    System.out.print("\nПроизведение положительных элементов: " + multiplication);

            // 16 Создать двумерный массив 3x3, заполнить случайными числами от -5 до 5 и вывести индексы всех нулевых элементов.

            //  Random random = new Random();
            //  int min = -5;
            //  int max = 5;

            //  int[][] arrays = new int[3][3];

            //  for (int i = 0; i < arrays.length; i++) {
            //      for (int j = 0; j < arrays[i].length; j++) {
            //          arrays[i][j] = random.nextInt(max - min + 1) + min;
            //      }
            //  }
            //  for (int i = 0; i < arrays.length; i++) {
            //      System.out.println();
            //      for (int j = 0; j < arrays[i].length; j++) {
            //          System.out.print(arrays[i][j] + " ");
            //      }
            //  }
            //  System.out.println("\nИндекс нулевого элемента: ");
            //  for (int i = 0; i < arrays.length; i++) {
            //      for (int j = 0; j < arrays[i].length; j++) {
            //          if (arrays[i][j] == 0) {
            //              System.out.print(i + ",");
            //              System.out.print(j);
            //          }

            //      }

            //  }

            //17 Заполнить двумерный массив 2x5 числами от 1 до 10 и найти сумму элементов
            // с чётными индексами (строка и столбец одновременно чётные).

            //   int[][] arrays = {{1, 2, 3, 4, 5},
            //                     {6, 7, 8, 9, 10},};

            //   for (int i = 0; i < arrays.length; i++) {
            //       System.out.println();
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           System.out.print(arrays[i][j] + " ");

            //       }

            //   }
            //   int sum = 0;
            //   for (int i = 0; i < arrays.length; i++) {
            //       for (int j = 0; j < arrays[i].length; j++) {
            //           if (i % 2 == 0 && j % 2 == 0)
            //               sum += arrays[i][j];
            //       }
            //   }
            //   System.out.print("\nСумма элементов с четными индексами: " + sum);

            // 18 Создать двумерный массив 2x3 и проверить, есть ли в нём хотя бы один отрицательный элемент.

            //    Random random = new Random();
            //    int min = -10;
            //    int max = 10;
            //    int count = 0;

            //    int[][] arrays = new int[2][3];

            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            arrays[i][j] = random.nextInt(max - min + 1) + min;
            //        }

            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        System.out.println();
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            System.out.print(arrays[i][j] + " ");
            //        }
            //    }
            //    for (int i = 0; i < arrays.length; i++) {
            //        for (int j = 0; j < arrays[i].length; j++) {
            //            if (arrays[i][j] < 0)
            //                count++;
            //        }
            //    }
            //    System.out.print("\nКоличество отрицательных элементов: " + count);
        }

    }
