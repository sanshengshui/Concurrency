package Concu_chapter02_02.t22;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
