package Concu_chapter02_03.t4;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class AddCountThread extends Thread {
    private AtomicInteger count=new AtomicInteger(0);

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
