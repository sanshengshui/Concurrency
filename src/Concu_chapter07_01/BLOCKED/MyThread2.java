package Concu_chapter07_01.BLOCKED;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
