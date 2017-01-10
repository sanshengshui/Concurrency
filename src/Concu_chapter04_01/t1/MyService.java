package Concu_chapter04_01.t1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i=0;i<5;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}
