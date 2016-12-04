package Concu_chapter01_02;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class MyThread4 extends Thread {
    @Override
    public void run() {
        super.run();
        try{
        System.out.println("run begin");
        Thread.sleep(200000);
    }catch (InterruptedException e){
    System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
            e.printStackTrace();
    }
    }
}
