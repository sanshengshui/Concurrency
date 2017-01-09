package Concu_chapter03_02.t8;

import java.util.Date;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try{
            for (int i=0;i<20;i++){
                if (Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("A "+Tools.t1.get().getTime());
                Thread.sleep(100);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
