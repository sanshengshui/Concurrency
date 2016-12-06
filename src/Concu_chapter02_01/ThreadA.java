package Concu_chapter02_01;

/**
 * Created by james on 16-12-6.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }

    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;

    }
}
