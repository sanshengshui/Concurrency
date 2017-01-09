package Concu_chapter03_01.moreproduct_moreconsume;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadC extends Thread {
    private C r;
    public ThreadC(C r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        r.getValue();
    }
}
