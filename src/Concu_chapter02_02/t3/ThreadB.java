package Concu_chapter02_02.t3;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ThreadB extends  Thread {
    private ObjectService service;
    public ThreadB(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
