package Concu_chapter03_01.t10;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class ThreadAdd extends Thread {
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p=p;
    }

    @Override
    public void run() {
        p.add();
    }
}
