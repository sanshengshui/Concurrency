package Concu_chapter02_02.t12;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
