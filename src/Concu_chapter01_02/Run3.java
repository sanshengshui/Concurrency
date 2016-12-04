package Concu_chapter01_02;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class Run3 {
    public static void main(String[] args){
        try{
        MyThread3 thread3=new MyThread3();
        thread3.start();
        Thread.sleep(200);
        thread3.interrupt();
    }catch (InterruptedException e){
    System.out.println("main catch");
            e.printStackTrace();
    }
    System.out.println("end!");
    }
}
