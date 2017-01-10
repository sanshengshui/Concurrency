package Concu_chapter04_01.t4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void waitMethod(){
       try{
           lock.lock();
           System.out.println("A");
           condition.await();
           System.out.println("B");
       }catch (InterruptedException e){
           e.printStackTrace();
       }finally {
           lock.unlock();
           System.out.println(" 锁释放了！");
       }

    }
}
