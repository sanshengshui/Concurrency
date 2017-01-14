package Concu_chapter07_01.timed_waiting;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin sleep");
            Thread.sleep(1000);
            System.out.println(" end sleep");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
