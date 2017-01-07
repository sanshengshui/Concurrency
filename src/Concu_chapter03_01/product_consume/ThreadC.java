package Concu_chapter03_01.product_consume;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class ThreadC extends Thread{
    private C r;
    public ThreadC(C r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        while(true){
            r.getValue();
        }
    }
}
