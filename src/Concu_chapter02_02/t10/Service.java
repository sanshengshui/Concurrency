package Concu_chapter02_02.t10;

/**
 * Created by jamesmsw on 16-12-27.
 */
public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1-----getLock time="
                +System.currentTimeMillis()+" run ThreadName="
                +Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1-----releaseLock time="
                        +System.currentTimeMillis()+" run ThreadName="
                        +Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
