package Concu_chapter01_02;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class Run {
    public static void main(String[] args){
        try{
        MyThread thread=new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

    }catch (InterruptedException e){
    System.out.println("main catch");
            e.printStackTrace();
    }
    }
}
