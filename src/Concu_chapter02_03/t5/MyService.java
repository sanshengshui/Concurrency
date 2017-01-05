package Concu_chapter02_03.t5;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class MyService {
    public static AtomicLong aiRef=new AtomicLong();
    synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是:"+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
