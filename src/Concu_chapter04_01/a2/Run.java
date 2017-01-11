package Concu_chapter04_01.a2;

import Concu_chapter02_02.t5.ThreadA;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA=new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB=new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));

    }
}
