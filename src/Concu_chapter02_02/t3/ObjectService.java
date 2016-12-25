package Concu_chapter02_02.t3;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ObjectService {
    public void serviceMethodA(){

        try {
            synchronized (this) {
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end end=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time="+System.currentTimeMillis());
            System.out.println("B end end="+System.currentTimeMillis());
        }
    }
}
