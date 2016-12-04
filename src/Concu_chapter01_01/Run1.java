package Concu_chapter01_01;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException{
        MyThread1 myThread1=new MyThread1();
        System.out.println("begin =="+myThread1.isAlive());
        myThread1.start();
        Thread.sleep(1000);
        System.out.println("end =="+myThread1.isAlive());
    }
}
