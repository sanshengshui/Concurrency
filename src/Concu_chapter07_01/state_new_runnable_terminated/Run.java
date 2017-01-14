package Concu_chapter07_01.state_new_runnable_terminated;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class Run {
    public static void main(String[] args){
        try {
            MyThread t=new MyThread();
            System.out.println("main方法中的状态1:"+t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2:"+t.getState());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
