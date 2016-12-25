package Concu_chapter02_02.t6;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.a();
    }
}
