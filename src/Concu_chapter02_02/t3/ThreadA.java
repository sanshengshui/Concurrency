package Concu_chapter02_02.t3;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
