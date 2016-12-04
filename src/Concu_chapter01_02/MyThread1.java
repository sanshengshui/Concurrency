package Concu_chapter01_02;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
