package Concu_chapter03_01.t9;

/**
 * Created by jamesmsw on 17-1-7.
 *
 * 通知过早
 */
public class MyRun {
    private String lock=new String("");
    private Runnable runnableA=new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    System.out.println("begin wait");
                lock.wait();
                    System.out.println("end wait");
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
                System.out.println("end nofify");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run =new MyRun();
        Thread a=new Thread(run.runnableA);
        a.start();

        Thread b=new Thread(run.runnableB);
        b.start();
        Thread.sleep(100);


    }
}
