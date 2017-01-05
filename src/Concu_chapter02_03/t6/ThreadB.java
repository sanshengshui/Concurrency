package Concu_chapter02_03.t6;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
