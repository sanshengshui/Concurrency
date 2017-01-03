package Concu_chapter02_02.t11;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
