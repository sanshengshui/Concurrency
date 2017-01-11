package Concu_chapter04_01.a1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Service {

    public ReentrantLock lock=new ReentrantLock();
    private Condition newConditon=lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            newConditon.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notityMethod(){
        try{
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(newConditon)+" 个线程正在等待newConditon");
            newConditon.signal();




        }finally {
            lock.unlock();
        }
    }

}
