package Concu_chapter04_01.a10;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run {
    public static void main(String[] args){
        try {
            Service service=new Service();
            MyThread myThread=new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
