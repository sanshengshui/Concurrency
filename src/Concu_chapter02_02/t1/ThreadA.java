package Concu_chapter02_02.t1;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ThreadA extends Thread {
    private ObjectService service;
    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
    public ThreadA(ObjectService service){
        super();
        this.service=service;
    }
}
