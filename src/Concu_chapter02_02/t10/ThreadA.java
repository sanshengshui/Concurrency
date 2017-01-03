package Concu_chapter02_02.t10;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class ThreadA extends  Thread {
    private Service service;
    private MyObject object;
    public ThreadA(Service service,MyObject object){
        super();
        this.service=service;
        this.object=object;

    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
