package Concu_chapter04_01.t9;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获取锁定");

        }finally {
            lock.unlock();
        }
    }
}
