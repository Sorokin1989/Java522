package ClassWork_32;

import java.io.IOException;


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





        System.out.println("Start main");

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
        Thread thread = new Thread() {
            @Override
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

            }
        };
        thread.start();
        System.out.println("End Main");
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