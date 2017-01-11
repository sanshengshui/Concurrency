package Concu_chapter04_01.t7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    public Condition conditionA=lock.newCondition();
    public Condition conditionB=lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA时间为"+System.currentTimeMillis()+
                    " ThreadName="+Thread.currentThread().getName());
            conditionA.await();
            System.out.println(" end awaitA时间为"+System.currentTimeMillis()+
                    " ThreadName="+Thread.currentThread().getName());

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB时间为"+System.currentTimeMillis()+
                    " ThreadName="+Thread.currentThread().getName());
            conditionB.await();
            System.out.println(" end awaitB时间为"+System.currentTimeMillis()+
                    " ThreadName="+Thread.currentThread().getName());

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void siganlAll_A(){
        try{
            lock.lock();
            System.out.println(" signalAll_A时间为"+System.currentTimeMillis()+
            " ThreadName="+Thread.currentThread().getName());
            conditionA.signalAll();

        }finally {
            lock.unlock();
        }
    }

    public void signalAll_B(){
        try{
            lock.lock();
            System.out.println(" signalAll_B时间为"+System.currentTimeMillis()+" ThreadName="+
            Thread.currentThread().getName());
            conditionB.signalAll();

        }finally {
            lock.unlock();
        }
    }
}