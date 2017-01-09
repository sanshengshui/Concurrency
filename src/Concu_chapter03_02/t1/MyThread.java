package Concu_chapter03_02.t1;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class MyThread extends Thread {
    @Override
    public void run() {

        try {
            int secondValue=(int)(Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
