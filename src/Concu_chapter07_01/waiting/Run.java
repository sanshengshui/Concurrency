package Concu_chapter07_01.waiting;

/**
 * Created by jamesmsw on 17-1-14.
 */
public class Run {
    public static void main(String[] args){
        try{
            MyThread t=new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t状态:"+t.getState());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
