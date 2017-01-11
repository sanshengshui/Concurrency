package Concu_chapter04_01.a8;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    public void waitMethod(){
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }
}
