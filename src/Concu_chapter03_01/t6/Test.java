package Concu_chapter03_01.t6;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class Test {
    public static void main(String[] args){
        try {
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}