package Concu_chapter03_02.t4;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b=b;
    }

    @Override
    public void run() {
        try{
            synchronized (b){
                b.start();
                b.join();
                for (int i=0;i<Integer.MAX_VALUE;i++){
                    String newString=new String();
                    Math.random();
                }
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
