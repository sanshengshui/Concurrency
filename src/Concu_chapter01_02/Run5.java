package Concu_chapter01_02;

/**
 * Created by james on 16-12-6.
 */
public class Run5 {
    public static void main(String[] args){
        try{
            MyThread5 thread5=new MyThread5();
            thread5.start();
            Thread.sleep(5000);
            thread5.suspend();
            System.out.println("A= "+System.currentTimeMillis()+" i="+thread5.getI());
            Thread.sleep(5000);
            System.out.println("A= "+System.currentTimeMillis()+" i="+thread5.getI());
            thread5.resume();
            Thread.sleep(5000);
            thread5.suspend();
            System.out.println("B= "+System.currentTimeMillis()+" i="+thread5.getI());
            Thread.sleep(5000);
            System.out.println("B= "+System.currentTimeMillis()+" i="+thread5.getI());

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
