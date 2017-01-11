package Concu_chapter04_01.a10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Service {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void testMethod(){
        try{
            lock.lock();
            System.out.println("wait begin");
            condition.awaitUninterruptibly();
            System.out.println("wait end");


        }finally {
            lock.unlock();
        }
    }
}
