package Concu_chapter02_03.t3;

/**
 * Created by jamesmsw on 17-1-5.
 */
/*
关键字volatile虽然增加了实例变量在多个线程之间的可见性，但它却不具备同步性，那么也就不具备原子性。
 */
public class MyThread extends Thread{
    volatile public static int count;
    synchronized  private static void addCount(){
        for (int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
