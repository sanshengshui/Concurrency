package Concu_chapter04_01.a4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁情况:"+lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
