package Concu_chapter06_01.DCL;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
