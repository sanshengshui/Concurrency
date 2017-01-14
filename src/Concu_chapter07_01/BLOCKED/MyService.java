package Concu_chapter07_01.BLOCKED;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class MyService {
    synchronized static public void serviceMethod(){
        try{
            System.out.println(Thread.currentThread().getName()+"进入了业务方法！");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
