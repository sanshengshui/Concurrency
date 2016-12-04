package Concu_chapter01_01;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("run threadName="+
            this.currentThread().getName()+"begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+
            this.currentThread().getName()+" end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
