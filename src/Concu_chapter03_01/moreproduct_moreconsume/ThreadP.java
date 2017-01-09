package Concu_chapter03_01.moreproduct_moreconsume;

/**
 * Created by jamesmsw on 17-1-9.
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
