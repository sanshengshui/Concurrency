package Concu_chapter03_02.t4;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        super();
        this.threadB=threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
