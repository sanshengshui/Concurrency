package Concu_chapter04_01.a11;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class MyThreadB extends Thread {
    private Service service;
    public MyThreadB(Service service){
        super();
        this.service=service;

    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
