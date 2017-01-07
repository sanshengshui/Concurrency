package Concu_chapter03_01.t10;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
