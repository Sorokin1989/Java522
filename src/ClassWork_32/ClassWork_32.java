package ClassWork_32;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//class MyThread extends Thread {
//
//    private String rezult;
//  public void run() {
//      this.setName("MyThread");
//      System.out.println("Start " + this.getName());
//      for (int i = 0; i < 10; i++) {
//          try {
//              Thread.sleep(2000);
//          } catch (InterruptedException e) {
//              throw new RuntimeException(e);
//          }
//          System.out.print(i + " ");
//
//      }
//      System.out.println("\nEnd " + this.getName());
//      rezult="Good task";
//  }
//
//    public String getRezult() {
//        return rezult;
//    }
//
//    public void setRezult(String rezult) {
//        this.rezult = rezult;
//    }
//}

class MyThread implements Runnable {

    private String rezult;

    public void run() {
        System.out.println("Start myThread");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i + " ");

        }
        System.out.println("End myThread");
        rezult = "Good task";
    }

    public String getRezult() {
        return rezult;
    }

    public void setRezult(String rezult) {
        this.rezult = rezult;
    }
}

public class ClassWork_32 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(5);

        Runnable runnable=()-> {
            System.out.println("Task Runnable начал выполнение" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Task Runnable завершил выполнение" + Thread.currentThread().getName());
        };

        Callable<Integer> integerCallable=()->{
            System.out.println("Task Callable<Integer> начал выполнение" + Thread.currentThread().getName());
          int result=43;
            Thread.sleep(5000);
            System.out.println("Task Callable<Integer> завершил выполнение" + Thread.currentThread().getName());
            return result;
        };

        Callable<String> stringCallable=()->{
            System.out.println("Task Callable<String> начал выполнение" + Thread.currentThread().getName());
          String result="Hello World";
            Thread.sleep(5000);
            System.out.println("Task Callable<String> завершил выполнение" + Thread.currentThread().getName());
            return result;
        };

//        ExecutorService executorService= Executors.newFixedThreadPool(5);
//
//        for (int i = 0; i < 100; i++) {
//            int taskNumber=i;
//            executorService.submit(()->{
//                System.out.println("Задача# " + taskNumber + " выполняется в потоке " +Thread.currentThread().getName());
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        }
//        executorService.shutdown();







//        System.out.println("Start main");
//
//                System.out.println("Start myThread");
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.print(i + " ");
//
//                }
//
//                System.out.println("End myThread");
//            }
//        };
      //  Thread thread = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Start myThread");
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.print(i + " ");
//
//                }
//                System.out.println("End myThread");
//
//            }
//        };
//        thread.start();
//        System.out.println("End Main");
//        System.out.println("Start main");
//
//               System.out.println("Start myThread");
//               for (int i = 0; i < 10; i++) {
//                   try {
//                       Thread.sleep(2000);
//                   } catch (InterruptedException e) {
//                       throw new RuntimeException(e);
//                   }
//                   System.out.print(i + " ");
//
//               }
//
//               System.out.println("End myThread");
//          }
//        };
//        Thread thread = new Thread(() -> {
//            System.out.println("Start myThread");
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.print(i + " ");
//
//            }
//
//            System.out.println("End myThread");
//        });
//        thread.start();
//
//        System.out.println("End main");


//        System.out.println("Start main");
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//                System.out.println("Start myThread");
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.print(i + " ");
//
//                }
//
//                System.out.println("End myThread");
//            }
//        };
//
//
//                Thread thread = new Thread(runnable);
//                thread.start();
//
//                System.out.println("End main");


//        System.out.println("Start main");
//        MyThread myThread=new MyThread();
//
//       Thread thread=new Thread(myThread);
//       thread.start();
//
//        System.out.println("End main");

//        System.out.println("Start main");
//
//       thread.start();
//
//
//        System.out.println("End main");
//        thread.join();
//
//        System.out.println(thread.getRezult());

//        Thread mainThread = Thread.currentThread();

        //  mainThread.stop();
        //  mainThread.suspend();
        // mainThread.resume()


        //   System.out.println(mainThread.isInterrupted());// поток был прерван или нет
        // Thread.interrupted();


//        mainThread.setName("This is main Thread");
//        System.out.println(mainThread.getName());
//        System.out.println(mainThread.threadId());
//        mainThread.setPriority(10);
//        System.out.println(mainThread.getPriority());
//        System.out.println(mainThread.getState());
//
//        mainThread.run();
//        mainThread.start();

//
//        mainThread.join(); // ждет выполнение потока
//        mainThread.join(5000);

//        System.out.println(mainThread.isAlive()); // поток жив или нет
//
//        mainThread.interrupt(); // прерывает поток


        // new новый поток
        //Runnable  поток работает в данный момент
        //Blocked поток заблокирован
        //Waiting поток ожидает
        //TimedWaiting ожидает по времени
        //Terminated поток завершен


//        System.out.println("start");
//        for (int i = 0; i < 10; i++) {
//            File file=new File("text" + i +  ".txt");
//            file.createNewFile();
//
//        }
//
//        Thread.sleep(10000);
//
//        System.out.println("End");


    }
}