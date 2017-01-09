package Concu_chapter03_02.t2;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            String newString =new String();
            Math.random();
        }
    }
}
