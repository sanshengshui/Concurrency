package Concu_chapter02_02.t18;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Run {
    public static void main(String[] args){
        try {
            DealThread t1=new DealThread();
            t1.setFlag("a");
            Thread thread1=new Thread(t1);
            thread1.start();
            Thread.sleep(1000);
            t1.setFlag("b");
            Thread thread2=new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
