package Concu_chapter03_02.t5;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadB extends Thread {
    synchronized public void run(){
        try{
            System.out.println("begin B ThreadName="+Thread.currentThread().getName()+" "
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" end B ThreadName="+Thread.currentThread().getName()+" "
            +System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
