package Concu_chapter03_01.t7;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        ThreadB b=new ThreadB(lock);
        b.start();
        ThreadC c=new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread=new NotifyThread(lock);
        notifyThread.start();


    }
}
