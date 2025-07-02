package ClassWork_32;

import java.io.IOException;



class MyThread extends Thread {
  public void run() {
      this.setName("MyThread");
      System.out.println("Start " + this.getName());
      System.out.println("Task done");
      System.out.println("End " + this.getName());
  }
}

public class ClassWork_32 {
    public static void main(String[] args) throws IOException, InterruptedException {

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
