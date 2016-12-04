package Concu_chapter01_01;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}
