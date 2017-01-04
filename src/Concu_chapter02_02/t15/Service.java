package Concu_chapter02_02.t15;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Service {
    public static void print(String stringParam){
        try {
            synchronized (stringParam){
                while(true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
