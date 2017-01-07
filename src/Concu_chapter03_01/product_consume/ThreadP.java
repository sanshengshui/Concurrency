package Concu_chapter03_01.product_consume;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }

    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
