package Concu_chapter01_01;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class Run2 {
    public static void main(String[] args){
        MyThread2 myThread2=new MyThread2();
        System.out.println("begin="+System.currentTimeMillis());
        myThread2.run();
        System.out.println("end="+System.currentTimeMillis());
    }
}
