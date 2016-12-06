package Concu_chapter01_02;

/**
 * Created by james on 16-12-6.
 */
public class MyThread5 extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    @Override
    public void run() {
        while(true){
            i++;
        }
    }

    public void setI(long i) {
        this.i = i;
    }
}
