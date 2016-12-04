package Concu_chapter01_01;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class MyThread extends Thread {
    private int i=5;
    @Override
    public void run() {
       System.out.println("i="+(i--)+" threadName="+Thread.currentThread().getName());
    }
}
