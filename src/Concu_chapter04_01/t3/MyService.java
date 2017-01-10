package Concu_chapter04_01.t3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();

    public void await(){
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
