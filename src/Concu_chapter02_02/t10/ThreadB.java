package Concu_chapter02_02.t10;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object){
        super();
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
