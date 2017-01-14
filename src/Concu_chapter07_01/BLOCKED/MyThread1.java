package Concu_chapter07_01.BLOCKED;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
