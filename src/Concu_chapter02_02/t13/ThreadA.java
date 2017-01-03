package Concu_chapter02_02.t13;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;

    }

    @Override
    public void run() {
        service.printA();
    }
}
