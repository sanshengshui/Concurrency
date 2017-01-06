package Concu_chapter03_01.t4;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait()");
            Thread.sleep(40000);
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
