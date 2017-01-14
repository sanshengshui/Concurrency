package Concu_chapter07_01.state_new_runnable_terminated;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法中的状态:"+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态:"+Thread.currentThread().getState());
    }
}
