package Concu_chapter06_01.enum_singleton;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}
