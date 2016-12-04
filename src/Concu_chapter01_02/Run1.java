package Concu_chapter01_02;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class Run1 {
    public static void main(String[] args){
        try{
        MyThread1 thread1=new MyThread1();
        thread1.start();
        Thread.sleep(1000);
        thread1.interrupt();
            System.out.println();
            System.out.println("是否停止1?="+thread1.isInterrupted());
            System.out.println("是否停止2?="+thread1.isInterrupted());


    }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();

    }
    System.out.println("end!");
    }
}
