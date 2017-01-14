package Concu_chapter07_01.waiting;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
      try{
          synchronized (Lock.lock) {
              Lock.lock.wait();
          }
      }catch (InterruptedException e){
          e.printStackTrace();
      }
    }
}
