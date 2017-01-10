package Concu_chapter04_01.t5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    public Condition condition=lock.newCondition();

    public void await(){
        try{
            lock.lock();
            System.out.println(" await时间为"+System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal(){
        try{
            lock.lock();
            System.out.println("signal时间为"+System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
