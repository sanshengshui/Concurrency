package Concu_chapter03_01.t9;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class MyRun1 {
    private String lock=new String("");
    private boolean isFirstRunB=false;
    private Runnable runnableA=new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while(isFirstRunB==false) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB=new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB =true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun1 run1=new MyRun1();
        Thread a=new Thread(run1.runnableA);
        a.start();
        Thread.sleep(100);
        Thread b=new Thread(run1.runnableB);
        b.start();


    }
}
