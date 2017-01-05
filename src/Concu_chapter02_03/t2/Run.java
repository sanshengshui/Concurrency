package Concu_chapter02_03.t2;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class Run {
    public static void main(String[] args){
        try {
            RunThread thread=new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
