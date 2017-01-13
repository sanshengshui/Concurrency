package Concu_chapter06_01.dealwith_lazy;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class Run1 {
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
