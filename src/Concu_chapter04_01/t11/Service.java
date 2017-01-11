package Concu_chapter04_01.t11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Service {
    public ReentrantLock lock=new ReentrantLock();

    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()
            +"进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
