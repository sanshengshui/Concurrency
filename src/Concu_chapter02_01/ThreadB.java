package Concu_chapter02_01;

/**
 * Created by james on 16-12-6.
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }

    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;

    }
}
