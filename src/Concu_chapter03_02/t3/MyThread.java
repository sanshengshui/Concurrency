package Concu_chapter03_02.t3;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin Timer="+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
