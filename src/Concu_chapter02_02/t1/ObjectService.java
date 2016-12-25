package Concu_chapter02_02.t1;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ObjectService {
    public void serviceMethod(){
        synchronized (this){

            try {
                System.out.println("begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end end="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
